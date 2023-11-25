package com.example.demo.model.champions.single;


import java.util.List;

public class ChampionDetails {
    private String id;
    private String key;
    private String name;
    private String title;
    private Image image;
    private List<Skin> skins;
    private String lore;
    private String blurb;
    private List<String> allytips;
    private List<String> enemytips;
    private List<String> tags;
    private String partype;
    private Info info;
    private Stats stats;
    private List<Spell> spells;
    private Passive passive;
    private List<String> recommended;

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

    public Image getImage() {
        return image;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public String getLore() {
        return lore;
    }

    public String getBlurb() {
        return blurb;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getPartype() {
        return partype;
    }

    public Info getInfo() {
        return info;
    }

    public Stats getStats() {
        return stats;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public Passive getPassive() {
        return passive;
    }

    public List<String> getRecommended() {
        return recommended;
    }
}
