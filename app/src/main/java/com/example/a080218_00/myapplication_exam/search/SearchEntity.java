package com.example.a080218_00.myapplication_exam.search;

import android.os.Build;

import java.io.Serializable;
import java.util.Objects;

public class SearchEntity implements Serializable {

    /*
    * Object, that is search item result.
    */

    private int id;
    private String dataText;
    private String link;

    public SearchEntity() {
    }

    public SearchEntity(int id, String title, String link) {
        this.id = id;
        this.dataText = title;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchEntity that = (SearchEntity) o;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return id == that.id &&
                    Objects.equals(dataText, that.dataText) &&
                    Objects.equals(link, that.link);
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return Objects.hash(id, dataText, link);
        }
        return 1;
    }
}
