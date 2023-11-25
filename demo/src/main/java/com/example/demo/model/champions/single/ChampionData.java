package com.example.demo.model.champions.single;

import java.util.List;

public class ChampionData {
    private String id;
    private String key;
    private String name;
    private String title;
    private ChampionImage image;
    private List<ChampionSkin> skins;
    private String lore;
    private String blurb;
    private List<String> allyTips;
    private List<String> enemyTips;
    private List<String> tags;
    private String partype;
    private ChampionInfo info;
    private ChampionStats stats;
    private List<ChampionSpell> spells;
    private ChampionPassive passive;
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

    public ChampionImage getImage() {
        return image;
    }

    public List<ChampionSkin> getSkins() {
        return skins;
    }

    public String getLore() {
        return lore;
    }

    public String getBlurb() {
        return blurb;
    }

    public List<String> getAllyTips() {
        return allyTips;
    }

    public List<String> getEnemyTips() {
        return enemyTips;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getPartype() {
        return partype;
    }

    public ChampionInfo getInfo() {
        return info;
    }

    public ChampionStats getStats() {
        return stats;
    }

    public List<ChampionSpell> getSpells() {
        return spells;
    }

    public ChampionPassive getPassive() {
        return passive;
    }

    public List<String> getRecommended() {
        return recommended;
    }
}
