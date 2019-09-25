package com.example.sampleapp.model;

/**
 * Created by Akhil on 20/2/2018.
 */

public class SpinnerObject {

    private String name;
    private int id;


    public SpinnerObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
