package com.example.demo.model.profiles;

import java.util.List;
import java.util.Map;

public class Perks {
    private Map<String, Integer> statPerks;
    private List<Styles> styles;

    public Map<String, Integer> getStatPerks() {
        return statPerks;
    }

    public List<Styles> getStyles() {
        return styles;
    }
}
