package com.example.demo.model.champions.single;

import java.util.Map;

public class ChampionData {
    private String type;
    private String format;
    private String version;
    private Map<String, ChampionDetails> champions;

    public String getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    public String getVersion() {
        return version;
    }

    public Map<String, ChampionDetails> getChampions() {
        return champions;
    }

    public ChampionDetails findChampion(String name){
        return getChampions().values().stream()
                .filter(champion->champion.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
