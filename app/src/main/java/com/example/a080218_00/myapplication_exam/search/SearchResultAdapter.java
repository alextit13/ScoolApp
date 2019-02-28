package com.example.a080218_00.myapplication_exam.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a080218_00.myapplication_exam.R;

import java.util.List;

public class SearchResultAdapter extends BaseAdapter {

    private List<SearchEntity> listSearchResult;
    private LayoutInflater inflater;

    public SearchResultAdapter(List<SearchEntity> listSearchResult, LayoutInflater inflater) {
        this.listSearchResult = listSearchResult;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return listSearchResult.size();
    }

    @Override
    public SearchEntity getItem(int position) {
        return listSearchResult.get(position);
    }

    @Override
    public long getItemId(int i) {
        return listSearchResult.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rootView = inflater.inflate(R.layout.item_search_result, viewGroup, false);
        ((TextView) rootView.findViewById(R.id.item_search_result_tv))
                .setText(getItem(i).getLink());
        return rootView;
    }
}
