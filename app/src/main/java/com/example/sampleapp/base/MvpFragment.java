package com.example.sampleapp.base;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;


/**
 * Created by Akhil on 20/2/2018
 */

public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment {
    protected P presenter;

    protected abstract P createPresenter();

    private BroadcastReceiver broadcastReceiver = null;
    private IntentFilter intentFilter = null;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        presenter = createPresenter();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.dettachView();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (presenter != null) {
            presenter.dettachView();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        registerReceivers();
    }

    @Override
    public void onPause() {
        unregisterReceivers();
        super.onPause();
    }

    public void registerReceivers() {
        if (broadcastReceiver != null && intentFilter != null && getActivity() != null) {
            LocalBroadcastManager.getInstance(getActivity().getApplicationContext()).registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public void unregisterReceivers() {
        if (broadcastReceiver != null && intentFilter != null && getActivity() != null) {
            LocalBroadcastManager.getInstance(getActivity().getApplicationContext()).unregisterReceiver(broadcastReceiver);
        }
    }

    public void addBroadcastListener(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.broadcastReceiver = broadcastReceiver;
        this.intentFilter = intentFilter;
    }

}
