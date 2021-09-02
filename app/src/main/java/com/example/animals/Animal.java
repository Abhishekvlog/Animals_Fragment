package com.example.animals;

public class Animal {
    private String Name;
    private int Imageid;

    public Animal(String name, int imageid) {
        Name = name;
        Imageid = imageid;
    }

    public String getName() {
        return Name;
    }

    public int getImageid() {
        return Imageid;
    }
}
