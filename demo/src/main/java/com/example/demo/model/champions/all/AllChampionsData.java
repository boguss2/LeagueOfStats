package com.example.demo.model.champions.all;

import java.util.Map;

public class AllChampionsData{
    private String type;
    private String format;
    private String version;
    private Map<String, Champion> data;

    public String getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    public String getVersion() {
        return version;
    }

    public Map<String, Champion> getData() {
        return data;
    }

    public Champion findChampion(String name){
        return getData().values().stream()
                .filter(champion -> champion.getId().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
