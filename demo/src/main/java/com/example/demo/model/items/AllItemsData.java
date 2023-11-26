package com.example.demo.model.items;

import java.util.Map;

public class AllItemsData {
    private String type;
    private String version;
    private Basic basic;
    private Map<String, Data> data;

    private Map<String, Integer> groups;

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public Basic getBasic() {
        return basic;
    }

    public Map<String, Data> getData() {
        return data;
    }

    public Map<String, Integer> getGroups() {
        return groups;
    }

    public Data findItem(String name){
        return getData().values().stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
