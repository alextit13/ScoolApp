package com.example.a080218_00.myapplication_exam.favorit;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class FavoriteItemsController implements IFavoriteItemsController {

    private static final String SP_DATABASE_NAME = "sp_favorits";

    private Context context;

    public FavoriteItemsController(Context context) {
        this.context = context;
    }

    @Override
    public void addToFavorite(String link) {
        context.getSharedPreferences(SP_DATABASE_NAME, Context.MODE_PRIVATE)
                .edit()
                .putString(link, link)
                .apply();
    }

    @Override
    public boolean isHaveInFavorite(String link) {
        return context.getSharedPreferences(SP_DATABASE_NAME, Context.MODE_PRIVATE).contains(link);
    }

    @Override
    public List<String> getAllFavoriteItems() {
        return new ArrayList<>(context.getSharedPreferences(SP_DATABASE_NAME, Context.MODE_PRIVATE).getAll().keySet());
    }

    @Override
    public void deleteFromFavorite(String link) {
        context.getSharedPreferences(SP_DATABASE_NAME, Context.MODE_PRIVATE).edit()
                .remove(link)
                .apply();
    }
}
