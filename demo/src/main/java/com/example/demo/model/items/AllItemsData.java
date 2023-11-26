package com.example.demo.model.items;

import java.util.Map;

public class AllItemsData {
    private String type;
    private String version;
    private Basic basic;
    private Map<String, Data> data;

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
}
