package com.example.demo.model.items;

import java.util.List;
import java.util.Map;

public class Data {
    private String name;
    private String description;
    private String colloq;
    private String plaintext;
    private List<String> into;
    private Image image;
    private Gold gold;
    private List<String> tags;
    private Map<String, Boolean> maps;
    private Map<String, Double> stats;
    private Map<String, Integer> effects;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getColloq() {
        return colloq;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public List<String> getInto() {
        return into;
    }

    public Image getImage() {
        return image;
    }

    public Gold getGold() {
        return gold;
    }

    public List<String> getTags() {
        return tags;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public Map<String, Double> getStats() {
        return stats;
    }

    public Map<String, Integer> getEffects() {
        return effects;
    }
}
