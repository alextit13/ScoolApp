package com.example.a080218_00.myapplication_exam.search;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SearchManager implements ISearchManager {

    private ISearchCallback callback;
    private Context context;

    public SearchManager(ISearchCallback callback, Context context) {
        this.callback = callback;
        this.context = context;
    }

    @Override
    public void searchWithQuery(String query) {
        List<SearchEntity> listWithAllSearchEntity = getAllDataFromDatabase();
        List<SearchEntity> listSearchResult = new ArrayList<>();
        for (SearchEntity entity : listWithAllSearchEntity) {
            if (entity.getDataText().contains(query)) {
                listSearchResult.add(entity);
            }
        }
        if (listSearchResult.isEmpty()) {
            Toast.makeText(context, "Поиск не дал результата", Toast.LENGTH_LONG).show();
        } else {
            SearchDataHolder.searchResultList = listSearchResult;
            callback.resultSearch();
        }
    }

    private List<SearchEntity> getAllDataFromDatabase() {
        List<String> listPaths = SearchListArticles.getDataArticlesPaths();
        List<SearchEntity> listWithSearchEntities = new ArrayList<>();
        for (String path : listPaths) {
            listWithSearchEntities.add(getDataFromInputStream(path));
        }
        return listWithSearchEntities;
    }

    private SearchEntity getDataFromInputStream(String url) {

        SearchEntity searchEntity = new SearchEntity();
        searchEntity.setLink(url);

        String resultText = "";
        // "razdel_1/v1/razdel1_v1.html"
        try {
            InputStream inputStream = context.getResources().getAssets().open(url);
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String read;
            while ((read=br.readLine()) != null) {
                sb.append(read);
            }
            br.close();
            resultText = sb.toString();
        }catch (Exception e) {
            Log.d("LOG_D", "getAllDataFromDatabase: ");
        }
        searchEntity.setDataText(resultText);
        return searchEntity;
    }

    public List<SearchEntity> searchResult() {
        return null;
    }
}
