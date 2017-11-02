package com.example.pc.deviceinfo;

import android.app.Application;

/**
 * Created by pc on 11/2/2017.
 */

public class AppApplication extends Application {
    public static final String TAG = AppApplication.class.getSimpleName();
    private static AppApplication mInstance;

    public static synchronized AppApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }
}
