package com.example.sampleapp.utils;

import android.content.Context;


/**
 * Created by Akhil on 09-08-2016.
 */
public class ObjectFactory {
    private static ObjectFactory objectFactory = null;
    private static AppPreference appPreference = null;
    private static AppPreferenceManager appPreferenceManager = null;
    Context context;


    public ObjectFactory(Context context) {
        this.context = context;
    }

    public static ObjectFactory getInstance(Context context) {
        if (objectFactory == null) {
            objectFactory = new ObjectFactory(context);
        }
        return objectFactory;
    }


    public AppPreference getAppPreference() {
        if (appPreference == null) {
            appPreference = new AppPreference(context);
        } else {
            appPreference.updateContext(context);
        }
        return appPreference;
    }

    public AppPreferenceManager getAppPreferenceManager() {
        if (appPreferenceManager == null) {
            appPreferenceManager = new AppPreferenceManager(context);
        } else {
            appPreferenceManager.updateContext(context);
        }
        return appPreferenceManager;
    }


}
