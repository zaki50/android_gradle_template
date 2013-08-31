package com.example.mytemplate;

import android.app.Application;
import com.example.mytemplate.prngfix.PRNGFixes;
import com.googlecode.androidannotations.annotations.EApplication;

@EApplication
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PRNGFixes.apply();
    }

}
