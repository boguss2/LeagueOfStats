package com.example.demo.model.profiles;

import java.util.List;

public class Metadata {
    private String dataVersion;
    private String matchId;
    private List<String> participants;

    public String getDataVersion() {
        return dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public List<String> getParticipants() {
        return participants;
    }
}
