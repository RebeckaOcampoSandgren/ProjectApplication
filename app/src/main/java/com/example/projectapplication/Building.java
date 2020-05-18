package com.example.projectapplication;

import androidx.annotation.NonNull;

public class Building {

    private String name;
    private String location;
    private int height;

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public String toString() {
        return name;
    }
}
