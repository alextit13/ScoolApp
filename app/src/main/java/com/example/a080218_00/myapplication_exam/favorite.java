package com.example.a080218_00.myapplication_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.a080218_00.myapplication_exam.favorit.FavoriteAdapter;
import com.example.a080218_00.myapplication_exam.favorit.FavoriteItemsController;

public class favorite extends AppCompatActivity {

    public static final String URL = "com.defs.myapplication.URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_activity);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_teory:
                        Intent intent_maps_main = new Intent(favorite.this, MainActivity.class);
                        startActivity(intent_maps_main);
                        break;
                    case R.id.action_test:
                        Intent intent_maps_test = new Intent(favorite.this, test_activity.class);
                        startActivity(intent_maps_test);
                        break;
                    case R.id.action_fav:
                        Intent intent_maps_fav = new Intent(favorite.this, favorite.class);
                        startActivity(intent_maps_fav);
                        break;
                }
                return false;
            }
        });

        initAdapter();
    }

    private void initAdapter() {
        ((ListView) findViewById(R.id.list_favorite_lv))
                .setAdapter(new FavoriteAdapter(getLayoutInflater(),
                        new FavoriteItemsController(this).getAllFavoriteItems()));
        ((ListView) findViewById(R.id.list_favorite_lv))
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(favorite.this, WebActivity.class);
                        intent.putExtra(URL, adapterView.getItemAtPosition(i).toString());
                        startActivity(intent);
                    }
                });
    }
}