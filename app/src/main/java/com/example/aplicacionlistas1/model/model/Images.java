package com.example.aplicacionlistas1.model.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Images implements Serializable {
    @SerializedName("jpg")
    @Expose
    private Jpg jpg;

    public Jpg getJpg() {
        return jpg;
    }

    public void setJpg(Jpg jpg) {
        this.jpg = jpg;
    }
}
