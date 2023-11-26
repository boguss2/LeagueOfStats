package com.example.demo.model.runes;

import java.util.Map;

public class AllRunesData {
    private String type;
    private String version;
    private Basic basic;
    private Map<String, Rune> data;

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public Basic getBasic() {
        return basic;
    }

    public Map<String, Rune> getData() {
        return data;
    }
}
