package com.example.demo.model.profiles;

import java.util.List;

public class Info {
    private String gameCreation;
    private long gameDuration;
    private long gameEndTimestamp;
    private String gameId;
    private String gameMode;
    private String gameName;
    private long gameStartTimestamp;
    private String gameType;
    private String gameVersion;
    private String mapId;
    private List<Participant> participants;

    public String getGameCreation() {
        return gameCreation;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public long getGameEndTimestamp() {
        return gameEndTimestamp;
    }

    public String getGameId() {
        return gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public String getGameName() {
        return gameName;
    }

    public long getGameStartTimestamp() {
        return gameStartTimestamp;
    }

    public String getGameType() {
        return gameType;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public String getMapId() {
        return mapId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }
}
