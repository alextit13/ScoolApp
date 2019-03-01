package com.example.a080218_00.myapplication_exam.favorit;

import java.util.List;

public interface IFavoriteItemsController {
    void addToFavorite(String link);
    boolean isHaveInFavorite(String link);
    List<String> getAllFavoriteItems();
    void deleteFromFavorite(String link);
}
