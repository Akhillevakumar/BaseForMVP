package com.example.sampleapp.utils;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import static kotlin.jvm.internal.Intrinsics.checkNotNull;


/**
 * Created by Akhil on 20/2/2018
 */

public class ActivityUtils {

    /**
     * @param fragmentManager
     * @param fragment
     * @param frameId
     */
    public static void addFragment(@NonNull FragmentManager fragmentManager,
                                   @NonNull Fragment fragment,
                                   int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment, getTagForFragment(fragment));

        transaction.commit();
    }

    public static String getTagForFragment(Fragment fragment) {
        return fragment.getClass().getSimpleName();
    }


    public static void addFragmentAddtoBackStack(@NonNull FragmentManager fragmentManager,
                                                 @NonNull Fragment fragment,
                                                 int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment, getTagForFragment(fragment));
        transaction.addToBackStack(getTagForFragment(fragment));
        transaction.commit();
    }

    public static void replaceFragmentAddtoBackStack(@NonNull FragmentManager fragmentManager,
                                                     @NonNull Fragment fragment,
                                                     int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment, getTagForFragment(fragment));
        transaction.addToBackStack(getTagForFragment(fragment));
        transaction.commit();
    }

    public static void replaceFragment(@NonNull FragmentManager fragmentManager,
                                       @NonNull Fragment fragment,
                                       int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(frameId, fragment, getTagForFragment(fragment));
        transaction.commit();
    }

}
