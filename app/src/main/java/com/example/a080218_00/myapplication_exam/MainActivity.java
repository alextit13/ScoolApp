package com.example.a080218_00.myapplication_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import com.example.a080218_00.myapplication_exam.search.ISearchCallback;
import com.example.a080218_00.myapplication_exam.search.ISearchManager;
import com.example.a080218_00.myapplication_exam.search.SearchEntity;
import com.example.a080218_00.myapplication_exam.search.SearchManager;
import com.example.a080218_00.myapplication_exam.search.SearchResultActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ISearchCallback {

    private ISearchManager searchManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_teory:
                        Intent intent_maps_main = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent_maps_main);
                        break;
                    case R.id.action_test:
                        Intent intent_maps_test = new Intent(MainActivity.this, test_activity.class);
                        startActivity(intent_maps_test);
                        break;
                    case R.id.action_fav:
                        Intent intent_maps_fav = new Intent(MainActivity.this, favorite.class);
                        startActivity(intent_maps_fav);
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menu_Search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                searchWithQuery(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void resultSearch() {
        startActivity(new Intent(this, SearchResultActivity.class));
    }

    private void searchWithQuery(String query) {
        if (searchManager == null) {
            searchManager = new SearchManager(this, this);
        }
        searchManager.searchWithQuery(query);
    }

    public void Screen_razdel1(View v) {
        Intent intObj = new Intent(this, razdel1.class);
        startActivity(intObj);
    }

    public void Screen_razdel2(View v) {
        Intent intObj = new Intent(this, razdel2.class);
        startActivity(intObj);
    }

    public void Screen_razdel3(View v) {
        Intent intObj = new Intent(this, razdel3.class);
        startActivity(intObj);
    }

    public void Screen_razdel4(View v) {
        Intent intObj = new Intent(this, razdel4.class);
        startActivity(intObj);
    }

    public void Screen_razdel5(View v) {
        Intent intObj = new Intent(this, razdel5.class);
        startActivity(intObj);
    }

    public void Screen_razdel6(View v) {
        Intent intObj = new Intent(this, razdel6.class);
        startActivity(intObj);
    }
}
