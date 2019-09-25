/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.sampleapp.utils;

import android.util.Log;

public class Logger {
    public static final String TAG = "Alpha";

    private static final boolean dAllowed = true;
    private static final boolean iAllowed = true;
    private static final boolean vAllowed = true;
    private static final boolean wAllowed = true;
    private static final boolean eAllowed = true;
    private static final boolean wtfAllowed = true;
    private static final boolean printlnAllowed = true;

    public static void d(String msg) {
        if (dAllowed)
            Log.d(TAG, msg);
    }

    public static void d(String msg, Exception e) {
        if (dAllowed)
            Log.d(TAG, msg, e);
        e.printStackTrace();
    }

    public static void i(String msg) {
        if (iAllowed)
            Log.i(TAG, msg);
    }

    public static void i(String msg, Exception e) {
        if (iAllowed)
            Log.i(TAG, msg, e);
        e.printStackTrace();
    }

    public static void v(String msg) {
        if (vAllowed)
            Log.v(TAG, msg);
    }

    public static void v(String msg, Exception e) {
        if (vAllowed)
            Log.v(TAG, msg, e);
        e.printStackTrace();
    }

    public static void w(String msg) {
        if (wAllowed)
            Log.w(TAG, msg);
    }

    public static void w(String msg, Exception e) {
        if (wAllowed)
            Log.w(TAG, msg, e);
        e.printStackTrace();
    }

    public static void e(String msg) {
        if (eAllowed)
            Log.e(TAG, msg);
    }

    public static void e(String msg, Exception e) {
        if (eAllowed)
            Log.e(TAG, msg, e);
        e.printStackTrace();
    }

    public static void wtf(String msg) {
        if (wtfAllowed)
            Log.wtf(TAG, msg);
    }

    public static void wtf(String msg, Exception e) {
        if (wtfAllowed)
            Log.wtf(TAG, msg, e);
        e.printStackTrace();
    }

    public static void println(String msg) {
        // Log.println(0, TAG, msg);
        if (printlnAllowed)
            System.out.println(msg);
    }

    public static void logBigString(String veryLongString) {
        int maxLogSize = 1000;

        for (int i = 0; i <= veryLongString.length() / maxLogSize; i++) {
            int start = i * maxLogSize;
            int end = (i + 1) * maxLogSize;
            end = end > veryLongString.length() ? veryLongString.length() : end;
            Log.v(TAG, veryLongString.substring(start, end));
        }
    }
}
