package com.example.a080218_00.myapplication_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

import com.example.a080218_00.myapplication_exam.favorit.FavoriteItemsController;
import com.example.a080218_00.myapplication_exam.favorit.IFavoriteItemsController;

public class WebActivity extends AppCompatActivity {

    private String url = "";
    private IFavoriteItemsController favoriteItemsController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        favoriteItemsController = new FavoriteItemsController(this);
        setContentView(R.layout.web_activity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        url = intent.getStringExtra(razdel1.URL);
        WebView wv = findViewById(R.id.webviewer);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_add_favorite, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (favoriteItemsController.isHaveInFavorite(url))
            menu.findItem(R.id.menu_add).setTitle("Удалить из закладок");
        else
            menu.findItem(R.id.menu_add).setTitle("добавить в закладки");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            case R.id.menu_add:
                clickOnFavoriteButton();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void clickOnFavoriteButton() {
        if (favoriteItemsController.isHaveInFavorite(url))
            favoriteItemsController.deleteFromFavorite(url);
        else
            favoriteItemsController.addToFavorite(url);
    }
}
