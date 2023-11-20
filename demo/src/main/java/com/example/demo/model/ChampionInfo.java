package com.example.demo.model;

public class ChampionInfo {
    private int attack;
    private int defence;
    private int magic;
    private int difficulty;

    public ChampionInfo(int attack, int defence, int magic, int difficulty) {
        this.attack = attack;
        this.defence = defence;
        this.magic = magic;
        this.difficulty = difficulty;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getMagic() {
        return magic;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
