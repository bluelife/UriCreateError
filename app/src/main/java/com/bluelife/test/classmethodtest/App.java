package com.bluelife.test.classmethodtest;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by HiWin10 on 2016/4/27.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this,"900027599",true);
    }
}
