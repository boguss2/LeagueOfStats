package com.example.demo.model.champions;

public class Champion {
    private String id;
    private String key;
    private String name;
    private String title;
    private String blurb;
    private ChampionInfo info;
    private ChampionImage image;
    private String[] tags;
    private String partype;
    private ChampionStats stats;

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getBlurb() {
        return blurb;
    }

    public ChampionInfo getInfo() {
        return info;
    }

    public ChampionImage getImage() {
        return image;
    }

    public String[] getTags() {
        return tags;
    }

    public String getPartype() {
        return partype;
    }

    public ChampionStats getStats() {
        return stats;
    }
}
