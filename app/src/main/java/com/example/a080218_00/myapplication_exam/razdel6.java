package com.example.a080218_00.myapplication_exam;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;



public class razdel6 extends AppCompatActivity implements OnClickListener{
    public static final String URL = "com.defs.myapplication.URL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.razdel6);
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
            case R.id.button61:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v1/razdel6_v1.html");
                startActivity(customIntent);
                break;
            case R.id.button62:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v2/razdel6_v2.html");
                startActivity(customIntent);
                break;
            case R.id.button63:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v3/razdel6_v3.html");
                startActivity(customIntent);
                break;
            case R.id.button64:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v4/razdel6_v4.html");
                startActivity(customIntent);
                break;
            case R.id.button65:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v5/razdel6_v5.html");
                startActivity(customIntent);
                break;
            case R.id.button66:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v6/razdel6_v6.html");
                startActivity(customIntent);
                break;
            case R.id.button67:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v7/razdel6_v7.html");
                startActivity(customIntent);
                break;
            case R.id.button68:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v8/razdel6_v8.html");
                startActivity(customIntent);
                break;

            case R.id.button69:
                customIntent = new Intent(this, WebActivity.class);
                customIntent.putExtra(URL, "file:///android_asset/razdel_6/v9/razdel6_v9.html");
                startActivity(customIntent);
                break;

        }
    }

}