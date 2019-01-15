package com.widgetmodule.test;

import android.app.Application;

import com.util.web.WebManager;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Web
        WebManager.$().init(getApplicationContext());
    }
}
