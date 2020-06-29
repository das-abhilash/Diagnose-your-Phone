package com.zollet.diagnoseyourapp;

import android.app.Application;
import android.content.ContextWrapper;

import com.pixplicity.easyprefs.library.Prefs;

public class DiogniseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Library EasyPrefs
        new Prefs.Builder()
                .setContext(this)
                .setMode(ContextWrapper.MODE_PRIVATE)
                .setPrefsName(BuildConfig.APPLICATION_ID)
                .setUseDefaultSharedPreference(true)
                .build();
    }
}
