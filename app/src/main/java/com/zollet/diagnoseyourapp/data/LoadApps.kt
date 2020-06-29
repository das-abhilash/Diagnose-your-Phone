package com.zollet.diagnoseyourapp.data

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.drawable.Drawable
import androidx.lifecycle.MutableLiveData
import com.zollet.diagnoseyourapp.models.App
import com.zollet.diagnoseyourapp.util.AppUtils
import java.util.*
import kotlin.concurrent.thread

class LoadApps(private val context: Context) {
    val installedApps = MutableLiveData<List<App>>()
    private var installedAppList: MutableList<App> = ArrayList()
    private var packageManager: PackageManager = context.packageManager

    private val defaultApplicationIcon: Drawable
        get() = packageManager.defaultActivityIcon

    fun searchInstalledApps() {
        thread(start = true) {
            installedAppList = mutableListOf()
            val installedApplicationsInfo = getInstalledApplication(context)
            appDetails(installedApplicationsInfo)
            updateInstalledApps()
        }
    }

    private fun getInstalledApplication(context: Context): List<ApplicationInfo> {
        return packageManager.getInstalledApplications(PackageManager.GET_META_DATA)
    }

    private fun appDetails(installedApplicationsInfo: List<ApplicationInfo>) {
        installedApplicationsInfo.map {
            installedAppList.add(createApp(it))
        }
    }

    private fun createApp(applicationInfo: ApplicationInfo): App {
        val systemApp = isSystemApps(applicationInfo)
        val isChineseApps = isChineseApps(applicationInfo)
        val label = getApplicationLabel(applicationInfo)
        val sourceDir = getApplicationSourceDir(applicationInfo)
        val packageName = getApplicationPackageName(applicationInfo)
        val icon = getAppliactionIcon(applicationInfo)
        val installedDate = getInstalledDate(packageName)
        val alternatives = AppUtils.getChineseAlternativeApp(packageName)
        return App(
            label,
            sourceDir,
            packageName,
            icon,
            systemApp,
            installedDate,
            isChineseApps,
            alternatives
        )
    }

    private fun isSystemApps(applicationInfo: ApplicationInfo): Boolean {
        return applicationInfo.flags and ApplicationInfo.FLAG_SYSTEM == 1
    }

    private fun isChineseApps(applicationInfo: ApplicationInfo): Boolean {
        return AppUtils.getChineseAppList().contains(applicationInfo.packageName);
    }

    private fun getApplicationLabel(applicationInfo: ApplicationInfo): String {
        return packageManager.getApplicationLabel(applicationInfo) as String
    }

    private fun getApplicationSourceDir(applicationInfo: ApplicationInfo): String {
        return applicationInfo.sourceDir
    }

    private fun getApplicationPackageName(applicationInfo: ApplicationInfo): String {
        return applicationInfo.packageName
    }

    private fun getAppliactionIcon(applicationInfo: ApplicationInfo): Drawable {
        return try {
            packageManager.getApplicationIcon(applicationInfo.processName)
        } catch (e: PackageManager.NameNotFoundException) {
            defaultApplicationIcon
        }
    }

    private fun getInstalledDate(packageName: String): Date {
        val installDate: Long = try {
            packageManager.getPackageInfo(packageName, 0).firstInstallTime
        } catch (e: PackageManager.NameNotFoundException) {
            Calendar.getInstance().timeInMillis
        }
        return Date(installDate)
    }

    private fun updateInstalledApps() {
        installedApps.postValue(installedAppList)
    }
}
