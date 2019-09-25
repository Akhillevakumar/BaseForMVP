package com.example.sampleapp.base;

import android.view.View;

/**
 * Created by Akhil on 20/2/2018.
 */

public interface OnItemClickListener {

    void onItemClick(View view, int position);

    void onLongItemClick(View view, int position);

    void onButtonClick(View view, int position);

}
