package com.example.sampleapp.network;

import rx.Subscriber;

/**
 * Created by Akhil on 20/2/2018
 */

public abstract class DatabaseCallback<M> extends Subscriber<M> {

    private static final String TAG = DatabaseCallback.class.getName();

    public abstract void onSuccess(M model);

    public abstract void onFailure(String message);

    public abstract void onFinish();

    @Override
    public void onError(Throwable e) {

        onFinish();
    }

    @Override
    public void onNext(M model) {
        onSuccess(model);
    }

    @Override
    public void onCompleted() {
        onFinish();
    }
}
