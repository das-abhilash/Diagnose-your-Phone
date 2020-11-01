package com.zollet.diagnoseyourphone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemAdapter
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemViewHolder
import com.zollet.diagnoseyourphone.R
import com.zollet.diagnoseyourphone.models.AlternativeApp
import com.zollet.diagnoseyourphone.models.App
import com.zollet.diagnoseyourphone.util.AppUtils
import kotlinx.android.synthetic.main.recycler_row_item.view.*
import kotlinx.android.synthetic.main.recycler_row_subitem.view.primaryText
import kotlinx.android.synthetic.main.recycler_row_subitem.view.rl_item
import kotlinx.android.synthetic.main.recycler_row_subitem.view.secondaryText

class AppExpandableRecyclerAdapter(
    val context: Context,
    private var installedApps: MutableList<App>
) : AbstractExpandableItemAdapter<AppExpandableRecyclerAdapter.ParentViewHolder, AppExpandableRecyclerAdapter.ChildViewHolder>() {

    init {
        setHasStableIds(true)
    }

    private val inflater = LayoutInflater.from(context)
    override fun getChildCount(groupPosition: Int): Int {
        return installedApps[groupPosition].alternatives.size
    }

    override fun onCheckCanExpandOrCollapseGroup(
        holder: ParentViewHolder,
        groupPosition: Int,
        x: Int,
        y: Int,
        expand: Boolean
    ): Boolean {
        return installedApps[groupPosition].isChineseApp
    }

    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): ParentViewHolder {
        return ParentViewHolder(inflater.inflate(R.layout.recycler_row_item, parent, false))
    }

    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): ChildViewHolder {
        return ChildViewHolder(inflater.inflate(R.layout.recycler_row_subitem, parent, false))
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun onBindChildViewHolder(
        holder: ChildViewHolder,
        groupPosition: Int,
        childPosition: Int,
        viewType: Int
    ) {
        val app = installedApps[groupPosition].alternatives[childPosition]
        holder.title.text = app.appName
        holder.appPackage.text = app.pacakgeName
        holder.rlItem.tag = app
        holder.rlItem.setOnClickListener { v ->
            val info = v.tag as? AlternativeApp ?: return@setOnClickListener
            AppUtils.redirectToPlayStore(context, info.pacakgeName)
        }
    }

    override fun onBindGroupViewHolder(
        holder: ParentViewHolder,
        groupPosition: Int,
        viewType: Int
    ) {
        val app = installedApps[groupPosition]
        holder.icon.setImageDrawable(app.icon)
        holder.title.text = app.name
        holder.appPackage.text = app.packageName
        holder.rlItem.tag = app
        if (app.alternatives.isEmpty()) holder.exapnd.visibility =
            View.GONE else holder.exapnd.visibility = View.VISIBLE
        holder.rlItem.setOnClickListener { v ->
            val info = v.tag as? App ?: return@setOnClickListener
            AppUtils.redirectToPlayStore(context, app.packageName)
        }
        holder.exapnd.setOnClickListener {
        }
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return "$groupPosition$childPosition".toLong()
    }

    override fun getGroupCount(): Int {
        return installedApps.size
    }

    fun updataList(arrayList: List<App>) {
        this.installedApps.clear()
        installedApps.addAll(arrayList)
        notifyDataSetChanged()
    }

    fun getItems(): List<App> {
        return installedApps
    }

    class ParentViewHolder(itemView: View) : AbstractExpandableItemViewHolder(itemView) {
        val icon: ImageView = itemView.imageView
        val title: TextView = itemView.primaryText
        val appPackage: TextView = itemView.secondaryText
        val rlItem: View = itemView.rl_item
        val exapnd: ImageView = itemView.expand
    }

    inner class ChildViewHolder(itemView: View) : AbstractExpandableItemViewHolder(itemView) {
        val title: TextView = itemView.primaryText
        val appPackage: TextView = itemView.secondaryText
        val rlItem: View

        init {
            rlItem = itemView.rl_item
        }
    }

}


