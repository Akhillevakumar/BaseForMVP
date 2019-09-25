package com.example.sampleapp.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.example.sampleapp.utils.Logger;


public class NetworkNotifier extends BroadcastReceiver {

    public static final String BROADCAST_WIFI_CHANGED = "BROADCAST_WIFI_CHANGED";

    @Override
    public void onReceive(Context context, Intent intent) {
        Logger.i("Network change detected");
        Intent restricted = new Intent(BROADCAST_WIFI_CHANGED);
        LocalBroadcastManager.getInstance(context).sendBroadcast(restricted);
        NetworkUtils.checkServerRequest(context);
    }
}
