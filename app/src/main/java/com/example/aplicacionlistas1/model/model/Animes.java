package com.example.aplicacionlistas1.model.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Animes implements Serializable {
    @SerializedName("data")
    @Expose
    private List<Anime> anime;

    public List<Anime> getData() {
        return anime;
    }

    public void setData(List<Anime> data) {
        this.anime = data;
    }
}
