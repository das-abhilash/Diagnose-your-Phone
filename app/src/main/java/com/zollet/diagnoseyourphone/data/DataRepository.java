package com.zollet.diagnoseyourphone.data;

import android.content.Context;

public class DataRepository {

    private static DataRepository dataRepository;
    private final LoadApps loadApps;

    public static DataRepository getDataRepository(final Context context) {
        if (dataRepository == null) {
            synchronized (DataRepository.class) {
                if (dataRepository == null)
                    dataRepository = new DataRepository(context);
            }
        }
        return dataRepository;
    }

    private DataRepository(final Context context) {
        loadApps = new LoadApps(context);
    }

    public LoadApps getLoadApps() {
        return loadApps;
    }
}
