package com.zollet.diagnoseyourphone.viewmodels

import android.app.Application
import androidx.lifecycle.LiveData
import com.zollet.diagnoseyourphone.data.DataRepository.getDataRepository
import com.zollet.diagnoseyourphone.data.LoadApps
import com.zollet.diagnoseyourphone.models.App

class InstalledAppViewModel(application: Application) : BaseViewModel(application) {

    val installedApps: LiveData<List<App>> by lazy {
        loadApps.installedApps
    }

    private val loadApps: LoadApps by lazy {
        val dataRepository = getDataRepository(application.baseContext)
        dataRepository.loadApps.also {
            it.searchInstalledApps()
        }
    }

    fun reloadInstalledAppsList() {
        loadApps.searchInstalledApps()
    }

    fun sortAppForInstallationDateDesc(installedApps: List<App>): List<App> {
        return installedApps.sortedByDescending {
            it.installedDate
        }
    }

    fun sortAppInAlphabeticalOrder(installedApps: List<App>): List<App> {
        return installedApps.sortedBy { it.name }
    }

    fun filterUserApps(installedApps: List<App>): List<App> {
        return installedApps.filter { !it.isSystemApp }
    }

    fun filterSystemApps(installedApps: List<App>): List<App> {
        return installedApps.filter { it.isSystemApp }
    }

    fun filterChineseApps(installedApps: List<App>): List<App> {
        return installedApps.filter { it.isChineseApp }
    }

    fun showAllApps(installedApps: List<App>): List<App> {
        return installedApps
    }

    fun filterApps(query: String, installedApp: List<App>): List<App> {
        return if (query.isEmpty())
            installedApp
        else {
            installedApp.filter { it.name.toLowerCase().contains(query) }
        }
    }
}
