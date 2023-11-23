package com.example.demo.model.versions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllVersionsData {
    public Data n;
    public String v;
    public String l;
    public String cdn;
    public String dd;
    public String lg;
    public String css;
    public int profileiconmax;
    public Object store;

    public Data getN() {
        return n;
    }

    public String getV() {
        return v;
    }

    public String getL() {
        return l;
    }

    public String getCdn() {
        return cdn;
    }

    public String getDd() {
        return dd;
    }

    public String getLg() {
        return lg;
    }

    public String getCss() {
        return css;
    }

    public int getProfileiconmax() {
        return profileiconmax;
    }

    public Object getStore() {
        return store;
    }
}
