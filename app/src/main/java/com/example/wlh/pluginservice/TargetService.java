package com.example.wlh.pluginservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

class TargetService extends Service {
    private final static String TAG = "TargetService";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) Log.d(TAG, "wanlihua debug TargetService onCreate!");


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (BuildConfig.DEBUG) Log.d(TAG, "wanlihua debug TargetService onStartCommand!");
        return super.onStartCommand(intent, flags, startId);
    }
}
