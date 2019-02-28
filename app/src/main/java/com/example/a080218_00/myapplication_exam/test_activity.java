package com.example.a080218_00.myapplication_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class test_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_teory:
                        Intent intent_maps_main = new Intent(test_activity.this, MainActivity.class);
                        startActivity(intent_maps_main);
                        break;
                    case R.id.action_test:
                        Intent intent_maps_test = new Intent(test_activity.this, test_activity.class);
                        startActivity(intent_maps_test);
                        break;
                    case R.id.action_fav:
                        Intent intent_maps_fav = new Intent(test_activity.this, favorite.class);
                        startActivity(intent_maps_fav);
                        break;
                }
                return false;
            }
        });
    }
}