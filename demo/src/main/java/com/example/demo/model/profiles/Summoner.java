package com.example.demo.model.profiles;

public class Summoner{
    private String accountId;
    private int profileIconId;
    private long revisionDate;
    private String name;
    private String id;
    private String puuid;
    private long summonerLevel;

    public String getAccountId() {
        return accountId;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPuuid() {
        return puuid;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }
}
