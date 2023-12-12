package com.example.demo.model.items;

import java.util.HashMap;
import java.util.List;

public class AllItemsData {
    private String type;
    private String version;
    private Basic basic;
    private HashMap<String, Data> data;

    private List<ItemGroup> groups;

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public Basic getBasic() {
        return basic;
    }

    public HashMap<String, Data> getData() {
        return data;
    }

    public List<ItemGroup> getGroups() {
        return groups;
    }

    public Data findItem(String name){
        return getData().values().stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
