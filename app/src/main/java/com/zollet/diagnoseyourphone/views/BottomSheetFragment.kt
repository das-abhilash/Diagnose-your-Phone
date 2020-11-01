package com.zollet.diagnoseyourphone.views

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.pixplicity.easyprefs.library.Prefs
import com.zollet.diagnoseyourphone.R
import com.zollet.diagnoseyourphone.databinding.FragmentBottomSheetBinding
import com.zollet.diagnoseyourphone.util.Constants.*
import com.zollet.diagnoseyourphone.util.Logger

class BottomSheetFragment : BottomSheetDialogFragment(), View.OnClickListener {

    private var binding: FragmentBottomSheetBinding? = null
    private var isSelectedBottomSheetFragment: IsSelectedBottomSheetFragment? = null

    interface IsSelectedBottomSheetFragment {
        fun onSelectedAlphabeticalOrder()

        fun onSelectInstallationDateOrder()

        fun onSelectedShowSystemApps()

        fun onSelectedShowUserApps()

        fun onSelectedShowChineseApps()

        fun onSelectedShowAllApps()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            isSelectedBottomSheetFragment = activity as IsSelectedBottomSheetFragment?
        } catch (e: ClassCastException) {
            Logger.d(
                BottomSheetFragment::class.java.simpleName,
                "Activity doesn't implement all interface method"
            )
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.BottomSheetDialogTheme)
        return super.onCreateDialog(savedInstanceState)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)
        //Set the custom view
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_bottom_sheet, null)
        dialog.setContentView(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_bottom_sheet, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readCheckedStored()
        setOnclickListener()
    }

    private fun readCheckedStored() {
        val storedStatusAlphabeticalOrder =
            Prefs.getBoolean(FLAG_ALPHABETICAL_ORDER, true)
        val storedStatusInstallationDate = Prefs.getBoolean(FLAG_INSTALLATION_DATE, false)
        val appFilter = Prefs.getInt(FLAG_SHOW_APP, FLAG_SHOW_ALL_APPS)
        setStateStoredOfcheckedAlphabeticalOrder(storedStatusAlphabeticalOrder)
        setStateStoredOfcheckedInstallationDate(storedStatusInstallationDate)
        updateFilterUi(appFilter)
    }

    private fun updateFilterUi(appFilter: Int) {
        when (appFilter) {
            FLAG_SHOW_ALL_APPS -> {
                setStateStoredOfShowAllApps(true)
                setStateStoredOfShowUserApps(false)
                setStateStoredOfShowSystemApps(false)
                setStateStoredOfShowChineseApps(false)
                setStateStoredOfShowThreatApps(false)
            }
            FLAG_SHOW_SYSTEM_APPS -> {
                setStateStoredOfShowAllApps(false)
                setStateStoredOfShowUserApps(false)
                setStateStoredOfShowSystemApps(true)
                setStateStoredOfShowChineseApps(false)
                setStateStoredOfShowThreatApps(false)
            }
            FLAG_SHOW_USER_APPS -> {
                setStateStoredOfShowAllApps(false)
                setStateStoredOfShowUserApps(true)
                setStateStoredOfShowSystemApps(false)
                setStateStoredOfShowChineseApps(false)
                setStateStoredOfShowThreatApps(false)
            }
            FLAG_SHOW_CHINESE_APPS -> {
                setStateStoredOfShowAllApps(false)
                setStateStoredOfShowUserApps(false)
                setStateStoredOfShowSystemApps(false)
                setStateStoredOfShowChineseApps(true)
                setStateStoredOfShowThreatApps(false)
            }
            FLAG_SHOW_THREAT_APPS -> {
                setStateStoredOfShowAllApps(false)
                setStateStoredOfShowUserApps(false)
                setStateStoredOfShowSystemApps(false)
                setStateStoredOfShowChineseApps(false)
                setStateStoredOfShowThreatApps(true)
            }
            else -> {
                setStateStoredOfShowAllApps(false)
                setStateStoredOfShowUserApps(true)
                setStateStoredOfShowSystemApps(false)
                setStateStoredOfShowChineseApps(false)
                setStateStoredOfShowThreatApps(false)
            }
        }
    }

    private fun setStateStoredOfcheckedAlphabeticalOrder(status: Boolean) {
        if (status)
            binding!!.checkedAlphabeticalOrder.visibility = View.VISIBLE
        else
            binding!!.checkedAlphabeticalOrder.visibility = View.GONE
    }

    private fun setStateStoredOfcheckedInstallationDate(status: Boolean) {
        if (status)
            binding!!.checkedInstallationDate.visibility = View.VISIBLE
        else
            binding!!.checkedInstallationDate.visibility = View.GONE
    }

    private fun setStateStoredOfShowAllApps(status: Boolean) {
        if (status)
            binding!!.checkedAllApps.visibility = View.VISIBLE
        else
            binding!!.checkedAllApps.visibility = View.GONE
    }

    private fun setStateStoredOfShowUserApps(status: Boolean) {
        if (status)
            binding!!.checkedUserApps.visibility = View.VISIBLE
        else
            binding!!.checkedUserApps.visibility = View.GONE
    }

    private fun setStateStoredOfShowSystemApps(status: Boolean) {
        if (status)
            binding!!.checkedSystemApps.visibility = View.VISIBLE
        else
            binding!!.checkedSystemApps.visibility = View.GONE
    }

    private fun setStateStoredOfShowChineseApps(status: Boolean) {
        if (status)
            binding!!.chineseChineseApps.visibility = View.VISIBLE
        else
            binding!!.chineseChineseApps.visibility = View.GONE
    }

    private fun setStateStoredOfShowThreatApps(status: Boolean) {
        if (status)
            binding!!.threatThreatApps.visibility = View.VISIBLE
        else
            binding!!.threatThreatApps.visibility = View.GONE
    }

    private fun setOnclickListener() {
        binding!!.alphabeticalOrder.setOnClickListener(this)
        binding!!.installationDate.setOnClickListener(this)
        binding!!.systemApps.setOnClickListener(this)
        binding!!.chineseApps.setOnClickListener(this)
        binding!!.allApps.setOnClickListener(this)
        binding!!.userApps.setOnClickListener(this)
        binding!!.threatApps.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.alphabetical_order -> {
                manageClickAppOrder(
                    binding!!.checkedAlphabeticalOrder,
                    binding!!.checkedInstallationDate
                )
                storedAlphabeticalOrderClicked()
                isSelectedBottomSheetFragment!!.onSelectedAlphabeticalOrder()
                dismiss()
            }
            R.id.installation_date -> {
                manageClickAppOrder(
                    binding!!.checkedInstallationDate,
                    binding!!.checkedAlphabeticalOrder
                )
                storedInstallationDateClicked()
                isSelectedBottomSheetFragment!!.onSelectInstallationDateOrder()
                dismiss()
            }
            R.id.system_apps -> {
                showSystemAppsClicked()
                dismiss()
            }
            R.id.user_apps -> {
                showUserAppsClicked()
                dismiss()
            }
            R.id.chinese_apps -> {
                showChineseAppsClicked()
                dismiss()
            }
            R.id.threat_apps -> {
                showThreatAppsClicked()
                dismiss()
            }
            R.id.all_apps -> {
                showAllAppsClicked()
                dismiss()
            }
        }
    }

    private fun manageClickAppOrder(clicked: ImageView, alreadyClicked: ImageView) {
        if (clicked.visibility == View.VISIBLE)
            return
        clicked.visibility = View.VISIBLE
        alreadyClicked.visibility = View.GONE
    }

    private fun storedAlphabeticalOrderClicked() {
        Prefs.putBoolean(FLAG_ALPHABETICAL_ORDER, true)
        Prefs.putBoolean(FLAG_INSTALLATION_DATE, false)
    }

    private fun storedInstallationDateClicked() {
        Prefs.putBoolean(FLAG_ALPHABETICAL_ORDER, false)
        Prefs.putBoolean(FLAG_INSTALLATION_DATE, true)
    }

    private fun showSystemAppsClicked() {
        val systemApps = binding!!.checkedSystemApps
        val checkedAllApps = binding!!.checkedAllApps
        val chineseChineseApps = binding!!.chineseChineseApps
        val userApps = binding!!.checkedUserApps
        val threatApps = binding!!.threatThreatApps
        if (systemApps.visibility == View.VISIBLE) return
        userApps.visibility = View.GONE
        systemApps.visibility = View.VISIBLE
        checkedAllApps.visibility = View.GONE
        chineseChineseApps.visibility = View.GONE
        threatApps.visibility = View.GONE
        Prefs.putInt(FLAG_SHOW_APP, FLAG_SHOW_SYSTEM_APPS)
        isSelectedBottomSheetFragment!!.onSelectedShowSystemApps()
    }

    private fun showUserAppsClicked() {
        val systemApps = binding!!.checkedSystemApps
        val checkedAllApps = binding!!.checkedAllApps
        val chineseChineseApps = binding!!.chineseChineseApps
        val userApps = binding!!.checkedUserApps
        val threatApps = binding!!.threatThreatApps
        if (userApps.visibility == View.VISIBLE) return
        userApps.visibility = View.VISIBLE
        systemApps.visibility = View.GONE
        checkedAllApps.visibility = View.GONE
        chineseChineseApps.visibility = View.GONE
        threatApps.visibility = View.GONE
        Prefs.putInt(FLAG_SHOW_APP, FLAG_SHOW_USER_APPS)
        isSelectedBottomSheetFragment!!.onSelectedShowUserApps()
    }

    fun showAllAppsClicked() {
        val systemApps = binding!!.checkedSystemApps
        val checkedAllApps = binding!!.checkedAllApps
        val chineseChineseApps = binding!!.chineseChineseApps
        val userApps = binding!!.checkedUserApps
        val threatApps = binding!!.threatThreatApps
        if (checkedAllApps.visibility == View.VISIBLE) return
        userApps.visibility = View.GONE
        systemApps.visibility = View.GONE
        checkedAllApps.visibility = View.VISIBLE
        chineseChineseApps.visibility = View.GONE
        threatApps.visibility = View.GONE
        Prefs.putInt(FLAG_SHOW_APP, FLAG_SHOW_ALL_APPS)
        isSelectedBottomSheetFragment!!.onSelectedShowAllApps()
    }

    private fun showChineseAppsClicked() {
        val systemApps = binding!!.checkedSystemApps
        val checkedAllApps = binding!!.checkedAllApps
        val chineseChineseApps = binding!!.chineseChineseApps
        val userApps = binding!!.checkedUserApps
        val threatApps = binding!!.threatThreatApps
        if (chineseChineseApps.visibility == View.VISIBLE) return
        userApps.visibility = View.GONE
        systemApps.visibility = View.GONE
        checkedAllApps.visibility = View.GONE
        threatApps.visibility = View.GONE
        chineseChineseApps.visibility = View.VISIBLE
        Prefs.putInt(FLAG_SHOW_APP, FLAG_SHOW_CHINESE_APPS)
        isSelectedBottomSheetFragment!!.onSelectedShowChineseApps()
    }

    private fun showThreatAppsClicked() {
        val systemApps = binding!!.checkedSystemApps
        val checkedAllApps = binding!!.checkedAllApps
        val chineseChineseApps = binding!!.chineseChineseApps
        val userApps = binding!!.checkedUserApps
        val threatApps = binding!!.threatThreatApps
        if (chineseChineseApps.visibility == View.VISIBLE) return
        userApps.visibility = View.GONE
        systemApps.visibility = View.GONE
        checkedAllApps.visibility = View.GONE
        chineseChineseApps.visibility = View.GONE
        threatApps.visibility = View.VISIBLE
        Prefs.putInt(FLAG_SHOW_APP, FLAG_SHOW_THREAT_APPS)
        isSelectedBottomSheetFragment!!.onSelectedShowChineseApps()
    }
}
