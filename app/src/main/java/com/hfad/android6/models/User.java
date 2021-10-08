package com.hfad.android6.models;

public class User {

    private String name;
    private int  image;
    private double  dollar;

    public User(String name, int image, double dollar) {
        this.name = name;
        this.image = image;
        this.dollar = dollar;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public double getDollar() {
         return dollar;
    }
}
