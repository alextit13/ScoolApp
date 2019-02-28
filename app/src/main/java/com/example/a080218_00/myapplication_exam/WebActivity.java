package com.example.a080218_00.myapplication_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_activity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // Get URL parameter from main activity
        Intent intent = getIntent();
        String url = intent.getStringExtra(razdel1.URL);
       /* String url1 = intent.getStringExtra(razdel2.URL);
        String url2 = intent.getStringExtra(razdel3.URL);
        String url3 = intent.getStringExtra(razdel4.URL);
        String url4 = intent.getStringExtra(razdel5.URL);
        String url5 = intent.getStringExtra(razdel6.URL);*/
        // Load local html file from received URL value
        WebView wv = findViewById(R.id.webviewer);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);
        /*wv.loadUrl(url1);
        wv.loadUrl(url2);
        wv.loadUrl(url3);
        wv.loadUrl(url4);
        wv.loadUrl(url5);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_add_favorite,menu);
        MenuItem item=menu.findItem(R.id.menu_add);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id == android.R.id.home ){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
