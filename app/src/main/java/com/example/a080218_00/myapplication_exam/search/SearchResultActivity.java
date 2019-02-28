package com.example.a080218_00.myapplication_exam.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.a080218_00.myapplication_exam.R;
import com.example.a080218_00.myapplication_exam.WebActivity;

import java.util.ArrayList;
import java.util.List;

public class SearchResultActivity extends AppCompatActivity {

    public static final String URL = "com.defs.myapplication.URL";

    private ListView listSearchResult;
    private SearchResultAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rearch_result);

        findViews();
        initAdapter();
        initListener();
    }

    private void findViews() {
        listSearchResult = findViewById(R.id.search_result_list);
    }

    private void initAdapter() {
        adapter = new SearchResultAdapter(SearchDataHolder.searchResultList, getLayoutInflater());
        listSearchResult.setAdapter(adapter);
    }

    private void initListener() {
        listSearchResult.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SearchResultActivity.this, WebActivity.class);
                intent.putExtra(URL, "file:///android_asset/" + SearchDataHolder.searchResultList.get(i).getLink());
                startActivity(intent);
            }
        });
    }
}
