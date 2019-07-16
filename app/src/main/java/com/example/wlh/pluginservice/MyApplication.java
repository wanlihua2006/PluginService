package com.example.wlh.pluginservice;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        try {
            HookHelper.HookAMS();
            //HookHelper.hookHandler();//hookHandler
            //HookHelper.hookInstrumentation(base);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
