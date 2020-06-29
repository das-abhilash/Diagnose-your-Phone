package com.zollet.diagnoseyourapp.views

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager
import com.pixplicity.easyprefs.library.Prefs
import com.zollet.diagnoseyourapp.R
import com.zollet.diagnoseyourapp.adapters.AppExpandableRecyclerAdapter
import com.zollet.diagnoseyourapp.databinding.ActivityInstalledAppsBinding
import com.zollet.diagnoseyourapp.helpers.InsetDivider
import com.zollet.diagnoseyourapp.models.App
import com.zollet.diagnoseyourapp.util.AppUtils.redirectToPlayStore
import com.zollet.diagnoseyourapp.util.Constants
import com.zollet.diagnoseyourapp.viewmodels.InstalledAppViewModel
import java.util.*

class InstalledAppActivity : BaseActivity(), View.OnClickListener,
    SwipeRefreshLayout.OnRefreshListener,
    BottomSheetFragment.IsSelectedBottomSheetFragment {

    private val installedAppViewModel by lazy {
        ViewModelProvider(this).get(InstalledAppViewModel::class.java)
    }

    private var binding: ActivityInstalledAppsBinding? = null
    private var recyclerView: RecyclerView? = null
    private var appRecyclerAdapter: AppExpandableRecyclerAdapter? = null
    private var installedApps: List<App> = mutableListOf()
    private var expandableItemManager: RecyclerViewExpandableItemManager? = null

    private val insetDivider: RecyclerView.ItemDecoration
        get() {
            val dividerHeight = resources.getDimensionPixelSize(R.dimen.divider_height)
            val dividerColor = ContextCompat.getColor(this, R.color.divider)
            val marginLeft = resources.getDimensionPixelSize(R.dimen.divider_inset)
            return InsetDivider.Builder(this)
                .orientation(InsetDivider.VERTICAL_LIST)
                .dividerHeight(dividerHeight)
                .color(dividerColor)
                .insets(marginLeft, 0)
                .build()
        }

    override fun getLayoutId(): Int {
        return R.layout.activity_installed_apps
    }

    override fun setBottomAppBar() {
        val bottomAppBar = binding!!.bar
        setSupportActionBar(bottomAppBar)
    }

    override fun getViewModel(): InstalledAppViewModel {
        return installedAppViewModel
    }

    override fun setBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_installed_apps)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.fab -> {
                redirectToPlayStore(this, packageName)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bottomappbar_menu, menu)
        val actionSearch = menu.findItem(R.id.app_bar_search)
        manageSearch(actionSearch)
        return super.onCreateOptionsMenu(menu)
    }

    private fun manageSearch(searchItem: MenuItem) {
        val searchView = searchItem.actionView as SearchView
        manageFabOnSearchItemStatus(searchItem)
        manageInputTextInSearchView(searchView)
    }

    private fun manageFabOnSearchItemStatus(searchItem: MenuItem) {
        searchItem.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                binding!!.fab.hide()
                return true
            }

            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                binding!!.fab.show()
                return true
            }
        })
    }

    private fun manageInputTextInSearchView(searchView: SearchView) {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                if (installedApps.isEmpty())
                    return false
                val query = newText.toLowerCase().trim { it <= ' ' }
                val filteredApps =
                    getViewModel().filterApps(query, appRecyclerAdapter?.getItems() ?: emptyList())
                appRecyclerAdapter!!.updataList(filteredApps.toMutableList())
                return true
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_settings -> {
                val bottomSheetFragment = BottomSheetFragment()
                bottomSheetFragment.show(supportFragmentManager, "TAG")
            }
            android.R.id.home -> {
                val navigationDrawerFragment = NavigationDrawerFragment()
                navigationDrawerFragment.show(supportFragmentManager, "TAG")
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setOnclickListener()
        setOnRefreshListener()
        startLoadingAnimation()
        getViewModel().installedApps.observe(this, androidx.lifecycle.Observer {
            stopLoadingAnimation()
            binding!!.swipeRefresh.isRefreshing = false
            if (it == null) return@Observer
            this.installedApps = it.toMutableList()
            showAppsFilterFlag()
        })
    }

    private fun setOnclickListener() {
        binding!!.fab.setOnClickListener(this)
    }

    private fun setOnRefreshListener() {
        binding!!.swipeRefresh.setColorSchemeColors(resources.getColor(R.color.accent))
        binding!!.swipeRefresh.setOnRefreshListener(this)
    }

    private fun showAppsFilterFlag() {
        when (Prefs.getInt(Constants.FLAG_SHOW_APP, Constants.FLAG_SHOW_USER_APPS)) {
            Constants.FLAG_SHOW_ALL_APPS -> {
                onSelectedShowAllApps()
            }
            Constants.FLAG_SHOW_SYSTEM_APPS -> {
                onSelectedShowSystemApps()
            }
            Constants.FLAG_SHOW_USER_APPS -> {
                onSelectedShowUserApps()
            }
            Constants.FLAG_SHOW_CHINESE_APPS -> {
                onSelectedShowChineseApps()
            }
            else -> {
                onSelectedShowUserApps()
            }
        }
    }

    private fun sortInstalledApps(apps: List<App>): List<App> {
        val isAlphabeticalOrder = Prefs.getBoolean(Constants.FLAG_ALPHABETICAL_ORDER, true)
        val isInstallationDateOrder = Prefs.getBoolean(Constants.FLAG_INSTALLATION_DATE, false)
        return if (isAlphabeticalOrder && !isInstallationDateOrder) {
            getViewModel().sortAppInAlphabeticalOrder(apps)
        } else {
            getViewModel().sortAppInAlphabeticalOrder(apps)
        }
    }

    private fun updateRecyclerView(apps: List<App>) {
        binding?.tvEmptyState?.visibility = if (apps.isEmpty()) View.VISIBLE else View.GONE

        if (recyclerView == null)
            setRecyclerView(apps)
        else
            appRecyclerAdapter!!.updataList(apps.toMutableList())
    }

    private fun setRecyclerView(apps: List<App>) {
        recyclerView = binding!!.recyclerView
        val divider = insetDivider
        recyclerView!!.addItemDecoration(divider)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        appRecyclerAdapter = AppExpandableRecyclerAdapter(this, apps.toMutableList())
        expandableItemManager = RecyclerViewExpandableItemManager(null);
        val wrappedAdapter = expandableItemManager?.createWrappedAdapter(appRecyclerAdapter!!)
        recyclerView!!.adapter = wrappedAdapter
        expandableItemManager?.attachRecyclerView(recyclerView!!);
    }

    private fun startLoadingAnimation() {
        binding!!.animationView.visibility = View.VISIBLE
        binding!!.recyclerView.visibility = View.GONE
    }

    private fun stopLoadingAnimation() {
        binding!!.animationView.visibility = View.GONE
        binding!!.recyclerView.visibility = View.VISIBLE
    }

    override fun onRefresh() {
        getViewModel().reloadInstalledAppsList()
    }

    override fun onSelectedAlphabeticalOrder() {
        appRecyclerAdapter?.getItems()
            ?.let { updateRecyclerView(getViewModel().sortAppInAlphabeticalOrder(it)) }
    }

    override fun onSelectInstallationDateOrder() {
        appRecyclerAdapter?.getItems()
            ?.let { updateRecyclerView(getViewModel().sortAppForInstallationDateDesc(it)) }
    }

    override fun onSelectedShowSystemApps() {
        updateRecyclerView(sortInstalledApps(getViewModel().filterSystemApps(installedApps)))
    }

    override fun onSelectedShowUserApps() {
        updateRecyclerView(sortInstalledApps(getViewModel().filterUserApps(installedApps)))
    }

    override fun onSelectedShowChineseApps() {
        updateRecyclerView(sortInstalledApps(getViewModel().filterChineseApps(installedApps)))
    }

    override fun onSelectedShowAllApps() {
        updateRecyclerView(sortInstalledApps(getViewModel().showAllApps(installedApps)))
    }

    fun getInstalledApps(): List<App>? {
        return installedApps
    }

    fun setInstalledApps(installedApps: ArrayList<App>) {
        this.installedApps = installedApps
        showAppsFilterFlag()
    }
}