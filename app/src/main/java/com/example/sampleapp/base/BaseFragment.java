package com.example.sampleapp.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by Akhil on 20/2/2018
 */

public class BaseFragment extends Fragment {
    public Activity activity;
    private CompositeSubscription compositeSubscription;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        onUnsubscribe();
    }
    public void onUnsubscribe() {
        if (compositeSubscription != null) {
            compositeSubscription.unsubscribe();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        onUnsubscribe();
    }

}
