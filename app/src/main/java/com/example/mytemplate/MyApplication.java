package com.example.mytemplate;

import android.app.Application;
import com.example.mytemplate.prngfix.PRNGFixes;
import com.squareup.okhttp.OkHttpClient;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PRNGFixes.apply();
    }

    public OkHttpClient newHttpClient() {
        return new OkHttpClient();
    }
}
