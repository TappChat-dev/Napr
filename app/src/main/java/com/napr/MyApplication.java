package com.napr;

import android.app.Application;
import android.content.Context;
import android.os.Build;

public class MyApplication extends Application {
    private static MyApplication instance;
    private boolean isAidl;
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public void onCreate() {
        super.onCreate();
        instance = this;
        checkPermission();
    }

    public static synchronized MyApplication getInstance() {
        MyApplication myApplication;
        synchronized (MyApplication.class) {
            if (instance == null) {
                instance = new MyApplication();
            }
            myApplication = instance;
        }
        return myApplication;
    }

    /*public boolean checkPermission() {
        if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }*/

    public boolean checkPermission() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return false;
    }
}
