package com.example.mytemplate;

import android.app.Application;
import com.example.mytemplate.prngfix.PRNGFixes;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PRNGFixes.apply();
    }

}
