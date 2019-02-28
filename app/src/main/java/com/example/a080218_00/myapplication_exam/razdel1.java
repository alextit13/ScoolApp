package com.example.a080218_00.myapplication_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class razdel1 extends AppCompatActivity implements OnClickListener{

    public static final String URL = "com.defs.myapplication.URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.razdel1);
        ActionBar actionBar = getSupportActionBar();
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
            case R.id.button11:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v1/razdel1_v1.html");
                startActivity(customIntent);
                break;
            case R.id.button12:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v2/razdel1_v2.html");
                startActivity(customIntent);
                break;
            case R.id.button13:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v3/razdel1_v3.html");
                startActivity(customIntent);
                break;
            case R.id.button14:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v4/razdel1_v4.html");
                startActivity(customIntent);
                break;
            case R.id.button15:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v5/razdel1_v5.html");
                startActivity(customIntent);
                break;
            case R.id.button16:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v6/razdel1_v6.html");
                startActivity(customIntent);
                break;
            case R.id.button17:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v7/razdel1_v7.html");
                startActivity(customIntent);
                break;
            case R.id.button18:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v8/razdel1_v8.html");
                startActivity(customIntent);
                break;
            case R.id.button19:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_1/v9/razdel1_v9.html");
                startActivity(customIntent);
                break;

        }
    }


}