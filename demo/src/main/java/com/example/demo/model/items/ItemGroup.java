package com.example.demo.model.items;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemGroup {
    @JsonProperty("id")
    private String id;

    @JsonProperty("MaxGroupOwnable")
    private int maxGroupOwnable;
}
