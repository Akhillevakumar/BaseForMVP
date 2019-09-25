package com.example.sampleapp.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.sampleapp.R;
import com.example.sampleapp.model.SpinnerObject;

import java.util.ArrayList;

/**
 * Created by Akhil on 20/2/2018.
 */

public class CustomSpinnerAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList data;
    SpinnerObject tempValues = null;
    LayoutInflater inflater;


    public CustomSpinnerAdapter(Context context, int textViewResourceId, ArrayList objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        data = objects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = inflater.inflate(R.layout.spinner_selection, parent, false);
        tempValues = null;
        tempValues = (SpinnerObject) data.get(position);

        TextView txt = (TextView) row.findViewById(R.id.spinnerselection_txt);
        txt.setText(tempValues.getName());
        txt.setTextSize(16);
        txt.setTextColor(Color.parseColor("#00000000"));
        txt.setSingleLine(true);
        txt.setEllipsize(TextUtils.TruncateAt.END);
        txt.setSingleLine(true);

        return row;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {

        View row = inflater.inflate(R.layout.spinner_dropdown, parent, false);
        tempValues = null;
        tempValues = (SpinnerObject) data.get(position);

        TextView txt = (TextView) row.findViewById(R.id.dropdown_txt);
        txt.setText(tempValues.getName());
        txt.setTextSize(17);
        txt.setPadding(0, 10, 0, 10);
        txt.setGravity(Gravity.CENTER);
        txt.setTextColor(Color.parseColor("#5A499A"));
        txt.setBackgroundColor(Color.parseColor("#FFFFFF"));

        return row;
    }
}