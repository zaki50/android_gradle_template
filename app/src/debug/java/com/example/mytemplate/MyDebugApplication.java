package com.example.mytemplate;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import okhttp3.OkHttpClient;

public class MyDebugApplication extends MyApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }

    @Override
    public OkHttpClient newHttpClient() {
        return new OkHttpClient.Builder().addInterceptor(new StethoInterceptor()).build();
    }
}
