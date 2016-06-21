package com.example.mytemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            // アプリアイコンを左上に表示するのは API 21 から非推奨。どうしてみやりたければ ロゴとして出す
            // toolbar.setLogo(R.drawable.ic_launcher);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
