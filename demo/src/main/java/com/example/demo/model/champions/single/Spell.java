package com.example.demo.model.champions.single;

import java.util.List;

public class Spell {
    private String id;
    private String name;
    private String description;
    private String tooltip;
    private LevelTip leveltip;
    private int maxrank;
    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    private List<List<Double>> effect;
    private List<String> effectBurn;
    private List<Var> vars;
    private String costType;
    private String maxammo;
    private List<Integer> range;
    private String rangeBurn;
    private Image image;
    private String resource;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTooltip() {
        return tooltip;
    }

    public LevelTip getLeveltip() {
        return leveltip;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public List<List<Double>> getEffect() {
        return effect;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public List<Var> getVars() {
        return vars;
    }

    public String getCostType() {
        return costType;
    }

    public String getMaxammo() {
        return maxammo;
    }

    public List<Integer> getRange() {
        return range;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public Image getImage() {
        return image;
    }

    public String getResource() {
        return resource;
    }
}
