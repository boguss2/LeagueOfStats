package com.example.demo.model.champions;

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
        return getData().entrySet().stream()
                .filter(entry -> entry.getValue().getName().equalsIgnoreCase(name))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }
}
