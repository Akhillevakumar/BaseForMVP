package com.example.sampleapp.network;

import java.util.ArrayList;

/**
 * Created by Akhil on 20/2/2018
 */

public class DatabaseCallbackModel<M> {

    boolean status = false;
    String message = "";

    boolean callNext = false;


    ArrayList<M> mArrayList = new ArrayList<>();
    Object object = new Object();

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<M> getmArrayList() {
        return mArrayList;
    }

    public void setmArrayList(ArrayList<M> mArrayList) {
        this.mArrayList = mArrayList;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isCallNext() {
        return callNext;
    }

    public void setCallNext(boolean callNext) {
        this.callNext = callNext;
    }
}
