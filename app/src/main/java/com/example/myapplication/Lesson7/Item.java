package com.example.myapplication.Lesson7;

public class Item {

    String names;
    int images;

    public Item(String name,int img)
    {
        this.images=img;
        this.names=name;
    }
    public String getName()
    {
        return names;
    }
    public int getImage()
    {
        return images;
    }
}
