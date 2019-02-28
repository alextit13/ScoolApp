package com.example.a080218_00.myapplication_exam;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class razdel5 extends AppCompatActivity implements OnClickListener{
    public static final String URL = "com.defs.myapplication.URL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.razdel5);
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
        switch (v.getId()) {
            case R.id.button51:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v1/razdel5_v1.html");
                startActivity(customIntent);
                break;
            case R.id.button52:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v2/razdel5_v2.html");
                startActivity(customIntent);
                break;
            case R.id.button53:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v3/razdel5_v3.html");
                startActivity(customIntent);
                break;
            case R.id.button54:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v4/razdel5_v4.html");
                startActivity(customIntent);
                break;
            case R.id.button55:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v5/razdel5_v5.html");
                startActivity(customIntent);
                break;
            case R.id.button56:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v6/razdel5_v6.html");
                startActivity(customIntent);
                break;
            case R.id.button57:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v7/razdel5_v7.html");
                startActivity(customIntent);
                break;
            case R.id.button58:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v8/razdel5_v8.html");
                startActivity(customIntent);
                break;

            case R.id.button59:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v9/razdel5_v9.html");
                startActivity(customIntent);
                break;

            case R.id.button5_10:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_5/v10/razdel5_v10.html");
                startActivity(customIntent);
                break;

        }
    }
}