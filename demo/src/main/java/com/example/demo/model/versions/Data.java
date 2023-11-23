package com.example.demo.model.versions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    @JsonProperty("item")
    public String item;

    @JsonProperty("rune")
    public String rune;

    @JsonProperty("mastery")
    public String mastery;

    @JsonProperty("summoner")
    public String summoner;

    @JsonProperty("champion")
    public String champion;

    @JsonProperty("profileicon")
    public String profileicon;

    @JsonProperty("map")
    public String map;

    @JsonProperty("language")
    public String language;

    @JsonProperty("sticker")
    public String sticker;

    public String getItem() {
        return item;
    }

    public String getRune() {
        return rune;
    }

    public String getMastery() {
        return mastery;
    }

    public String getSummoner() {
        return summoner;
    }

    public String getChampion() {
        return champion;
    }

    public String getProfileicon() {
        return profileicon;
    }

    public String getMap() {
        return map;
    }

    public String getLanguage() {
        return language;
    }

    public String getSticker() {
        return sticker;
    }
}
