package com.example.sampleapp.network;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class NetworkUtils {

    public static final String BROADCAST_DATA_AVAILABILITY = "BROADCAST_DATA_AVAILABILITY";
    public static final String KEY_IS_AVAILABLE = "KEY_IS_AVAILABLE";


    public static void checkServerRequest(final Context context) {

        new AsyncTask<Void, Void, Boolean>() {

            @Override
            protected Boolean doInBackground(Void... params) {

                int sec = 30 * 1000;
                for (int i = 0; i < sec; i++) {
                    if (isAvailable()) {

                        break;
                    } else {
                        isAvailable();
                    }
                }


                return isAvailable();
            }

            @Override
            protected void onPostExecute(Boolean result) {

                super.onPostExecute(result);

                Intent intent = new Intent(BROADCAST_DATA_AVAILABILITY);
                intent.putExtra(KEY_IS_AVAILABLE, result);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);


            }

        }.execute();
    }

    public static boolean isAvailable() {

        // strictly background thread
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL("http://www.google.com/").openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            return (200 <= responseCode && responseCode <= 399);
        } catch (IOException exception) {
            return false;
        }
    }
}