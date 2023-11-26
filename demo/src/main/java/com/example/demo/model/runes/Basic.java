package com.example.demo.model.runes;

import java.util.List;
import java.util.Map;

public class Basic {
    private String name;
    private Rune rune;
    private Gold gold;
    private String group;
    private String description;
    private String colloq;
    private String plaintext;
    private boolean consumed;
    private int stacks;
    private int depth;
    private boolean consumeOnFull;
    private List<String> from;
    private List<String> into;
    private int specialRecipe;
    private boolean inStore;
    private boolean hideFromAll;
    private String requiredChampion;
    private Map<String, Double> stats;
    private List<String> tags;
    private Map<String, Boolean> maps;

    public String getName() {
        return name;
    }

    public Rune getRune() {
        return rune;
    }

    public Gold getGold() {
        return gold;
    }

    public String getGroup() {
        return group;
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

    public boolean isConsumed() {
        return consumed;
    }

    public int getStacks() {
        return stacks;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public List<String> getFrom() {
        return from;
    }

    public List<String> getInto() {
        return into;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public boolean isInStore() {
        return inStore;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public Map<String, Double> getStats() {
        return stats;
    }

    public List<String> getTags() {
        return tags;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }
}
