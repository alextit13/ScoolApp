package com.example.a080218_00.myapplication_exam;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;
public class razdel4 extends AppCompatActivity implements OnClickListener{
    public static final String URL = "com.defs.myapplication.URL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.razdel4);
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
            case R.id.button41:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v1/razdel4_v1.html");
                startActivity(customIntent);
                break;
            case R.id.button42:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v2/razdel4_v2.html");
                startActivity(customIntent);
                break;
            case R.id.button43:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v3/razdel4_v3.html");
                startActivity(customIntent);
                break;
            case R.id.button44:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v4/razdel4_v4.html");
                startActivity(customIntent);
                break;
            case R.id.button45:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v5/razdel4_v5.html");
                startActivity(customIntent);
                break;
            case R.id.button46:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v6/razdel4_v6.html");
                startActivity(customIntent);
                break;
            case R.id.button47:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v7/razdel4_v7.html");
                startActivity(customIntent);
                break;
            case R.id.button48:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_4/v8/razdel4_v8.html");
                startActivity(customIntent);
                break;

        }
    }
}