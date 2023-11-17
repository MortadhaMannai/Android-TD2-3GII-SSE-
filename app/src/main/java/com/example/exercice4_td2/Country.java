package com.example.exercice4_td2;

public class Country {
    private String name;
    private int imageResource;

    public Country(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}

