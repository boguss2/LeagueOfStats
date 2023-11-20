package com.example.demo.model;

public class ChampionImage {
    private String name;
    private String sprite;
    //"group":"champion","x":0,"y":0,"w":48,"h":48


    public ChampionImage(String name, String sprite) {
        this.name = name;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public String getSprite() {
        return sprite;
    }
}
