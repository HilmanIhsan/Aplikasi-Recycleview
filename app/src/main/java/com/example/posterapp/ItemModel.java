package com.example.posterapp;

public class ItemModel {
    String name, year;
    int poster;

    public ItemModel(String name, String year, int poster) {
        this.name = name;
        this.year = year;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getPoster() {
        return poster;
    }
}
