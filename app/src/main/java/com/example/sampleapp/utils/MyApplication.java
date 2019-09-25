package com.example.sampleapp.utils;


import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;


import com.example.sampleapp.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Akhil on 20/2/2018.
 */

public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("font/OpenSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .addCustomViewWithSetTypeface(CustomViewWithTypefaceSupport.class)
                .build()
        );
    }
}
