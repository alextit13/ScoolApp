package com.example.a080218_00.myapplication_exam;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;


public class razdel3 extends AppCompatActivity implements OnClickListener {

    public static final String URL = "com.defs.myapplication.URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.razdel3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent customIntent;
        switch (v.getId()) {
            case R.id.button31:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v1/razdel3_v1.html");
                startActivity(customIntent);
                break;
            case R.id.button32:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v2/razdel3_v2.html");
                startActivity(customIntent);
                break;
            case R.id.button33:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v3/razdel3_v3.html");
                startActivity(customIntent);
                break;
            case R.id.button34:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v4/razdel3_v4.html");
                startActivity(customIntent);
                break;
            case R.id.button35:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v5/razdel3_v5.html");
                startActivity(customIntent);
                break;
            case R.id.button36:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v6/razdel3_v6.html");
                startActivity(customIntent);
                break;
            case R.id.button37:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v7/razdel3_v7.html");
                startActivity(customIntent);
                break;
            case R.id.button38:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v8/razdel3_v8.html");
                startActivity(customIntent);
                break;
            case R.id.button39:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v9/razdel3_v9.html");
                startActivity(customIntent);
                break;
            case R.id.button3_10:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v10/razdel3_v10.html");
                startActivity(customIntent);
                break;
            case R.id.button3_11:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v11/razdel3_v11.html");
                startActivity(customIntent);
                break;
            case R.id.button3_12:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v12/razdel3_v12.html");
                startActivity(customIntent);
                break;
            case R.id.button3_13:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v13/razdel3_v13.html");
                startActivity(customIntent);
                break;
            case R.id.button3_14:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v14/razdel3_v14.html");
                startActivity(customIntent);
                break;
            case R.id.button3_15:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v15/razdel3_v15.html");
                startActivity(customIntent);
                break;
            case R.id.button3_16:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_3/v16/razdel3_v16.html");
                startActivity(customIntent);
                break;

        }
    }
}