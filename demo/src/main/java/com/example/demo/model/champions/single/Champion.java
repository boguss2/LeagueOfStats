package com.example.demo.model.champions.single;

import java.util.Map;

public class Champion {
    private String type;
    private String format;
    private String version;
    private Map<String, ChampionData> data;

    public String getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    public String getVersion() {
        return version;
    }

    public Map<String, ChampionData> getData() {
        return data;
    }

    public ChampionData getChampionData(String name){
        return getData().values().stream()
                .filter(champion->champion.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
