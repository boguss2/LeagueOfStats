package com.example.demo.model.items;

import java.util.List;
import java.util.Map;

public class Data {
    private String id;
    private String name;
    private String description;
    private String colloq;
    private String plaintext;
    private List<String> from;
    private List<String> into;
    private Image image;
    private Gold gold;
    private List<String> tags;
    private Map<String, Boolean> maps;
    private Map<String, Integer> stats;
    private int depth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
        this.stats = stats;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}

