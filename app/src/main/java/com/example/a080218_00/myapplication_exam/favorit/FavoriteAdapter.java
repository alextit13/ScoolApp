package com.example.a080218_00.myapplication_exam.favorit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a080218_00.myapplication_exam.R;
import com.example.a080218_00.myapplication_exam.StringConcatenateController;

import java.util.List;

public class FavoriteAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<String> listDataFavorites;

    public FavoriteAdapter(LayoutInflater inflater, List<String> listDataFavorites) {
        this.inflater = inflater;
        this.listDataFavorites = listDataFavorites;
    }

    @Override
    public int getCount() {
        return listDataFavorites.size();
    }

    @Override
    public String getItem(int position) {
        return listDataFavorites.get(position);
    }

    @Override
    public long getItemId(int i) {
        return listDataFavorites.get(i).hashCode();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rootView = inflater.inflate(R.layout.item_favorite, viewGroup, false);

        ((TextView) rootView.findViewById(R.id.item_favorite_title_tv))
                .setText(StringConcatenateController.formatString(listDataFavorites.get(position)));
        return rootView;
    }
}
