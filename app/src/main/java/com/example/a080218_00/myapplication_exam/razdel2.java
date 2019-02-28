package com.example.a080218_00.myapplication_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;


public class razdel2 extends AppCompatActivity implements OnClickListener {
    public static final String URL = "com.defs.myapplication.URL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.razdel2);
        ActionBar actionBar =getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id == android.R.id.home ){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View v) {
        Intent customIntent;
        switch(v.getId()) {
            case R.id.button21:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_2/v1/razdel2_v1.html");
                startActivity(customIntent);
                break;
            case R.id.button22:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_2/v2/razdel2_v2.html");
                startActivity(customIntent);
                break;
            case R.id.button23:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_2/v3/razdel2_v3.html");
                startActivity(customIntent);
                break;
            case R.id.button24:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_2/v4/razdel2_v4.html");
                startActivity(customIntent);
                break;


        }
    }
}