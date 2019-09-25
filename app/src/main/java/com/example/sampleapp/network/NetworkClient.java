package com.example.sampleapp.network;






import com.example.sampleapp.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Akhil on 20/2/2018
 */

public class NetworkClient {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {

            if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(500, TimeUnit.SECONDS).readTimeout(500, TimeUnit.SECONDS).addInterceptor(interceptor).build();

                retrofit = new Retrofit.Builder()
                        .baseUrl(ConstantsURL.BASE_URL_TEXT)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .client(okHttpClient)
                        .build();
            } else {

                OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(500, TimeUnit.SECONDS).readTimeout(500, TimeUnit.SECONDS).build();

                retrofit = new Retrofit.Builder()
                        .baseUrl(ConstantsURL.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .client(okHttpClient)
                        .build();
            }
        }
        return retrofit;
    }
}