package com.example.mytemplate;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class MainActivity extends SherlockActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
