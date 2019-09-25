package com.example.sampleapp.base;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import rx.subscriptions.CompositeSubscription;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by Akhil on 20/2/2018
 */

public class BaseActivity extends AppCompatActivity {

    public static boolean notHideKeyBoard = false;
    CompositeSubscription compositeSubscription;
    List<Call> calls;
    private BroadcastReceiver broadcastReceiver = null;
    private IntentFilter intentFilter = null;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        onCancelled();
        onUnsubscribe();
    }

    private void onCancelled() {
        if (calls != null && calls.size() > 0) {
            for (Call call : calls) {
                if (!call.isCanceled()) {
                    call.cancel();
                }
            }
        }
    }

    public void addCalls(Call call) {
        if (calls == null) {
            calls = new ArrayList<>();
        }
        calls.add(call);
    }

    private void onUnsubscribe() {
        if (compositeSubscription != null && compositeSubscription.hasSubscriptions()) {
            compositeSubscription.unsubscribe();
        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));

    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View v = getCurrentFocus();

        if (v != null &&
                (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) &&
                v instanceof EditText &&
                !v.getClass().getName().startsWith("android.webkit.")) {
            int[] scrcoords = new int[2];
            v.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + v.getLeft() - scrcoords[0];
            float y = ev.getRawY() + v.getTop() - scrcoords[1];

            if (x < v.getLeft() || x > v.getRight() || y < v.getTop() || y > v.getBottom())
                hideKeyboard(this);
        }
        return super.dispatchTouchEvent(ev);
    }

    public static void hideKeyboard(Activity activity) {
        if (activity != null && activity.getWindow() != null && activity.getWindow().getDecorView() != null && !notHideKeyBoard) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);

            imm.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }


    public void registerReceivers() {
        if (broadcastReceiver != null && intentFilter != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public void unregisterReceivers() {
        if (broadcastReceiver != null && intentFilter != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(broadcastReceiver);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        registerReceivers();
    }

    @Override
    protected void onPause() {
        unregisterReceivers();
        super.onPause();
    }

    public void setBroadcastReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.broadcastReceiver = broadcastReceiver;
        this.intentFilter = intentFilter;
    }
}
