package com.example.demo.model;

public class ChampionStats {
    private int hp;
    private int hpPerLvl;
    private int mp;
    private int mpPerLvl;
    private int ms;
    private int armor;
    private int armorPerLvl;
    private int mr;
    private int mrPerLvl;
    private int attackrange;
    private int hpregen;
    private int hpregenPerLvl;
    private int mpregen;
    private int mpregenPerLvel;
    private int crit;
    private int critPerLvl;
    private int ad;
    private int adPerLvl;
    private int asPerLvl;
    private int as;

    public ChampionStats(int hp, int hpPerLvl, int mp, int mpPerLvl, int ms, int armor, int armorPerLvl, int mr, int mrPerLvl, int attackrange, int hpregen, int hpregenPerLvl, int mpregen, int mpregenPerLvel, int crit, int critPerLvl, int ad, int adPerLvl, int asPerLvl, int as) {
        this.hp = hp;
        this.hpPerLvl = hpPerLvl;
        this.mp = mp;
        this.mpPerLvl = mpPerLvl;
        this.ms = ms;
        this.armor = armor;
        this.armorPerLvl = armorPerLvl;
        this.mr = mr;
        this.mrPerLvl = mrPerLvl;
        this.attackrange = attackrange;
        this.hpregen = hpregen;
        this.hpregenPerLvl = hpregenPerLvl;
        this.mpregen = mpregen;
        this.mpregenPerLvel = mpregenPerLvel;
        this.crit = crit;
        this.critPerLvl = critPerLvl;
        this.ad = ad;
        this.adPerLvl = adPerLvl;
        this.asPerLvl = asPerLvl;
        this.as = as;
    }

    public int getHp() {
        return hp;
    }

    public int getHpPerLvl() {
        return hpPerLvl;
    }

    public int getMp() {
        return mp;
    }

    public int getMpPerLvl() {
        return mpPerLvl;
    }

    public int getMs() {
        return ms;
    }

    public int getArmor() {
        return armor;
    }

    public int getArmorPerLvl() {
        return armorPerLvl;
    }

    public int getMr() {
        return mr;
    }

    public int getMrPerLvl() {
        return mrPerLvl;
    }

    public int getAttackrange() {
        return attackrange;
    }

    public int getHpregen() {
        return hpregen;
    }

    public int getHpregenPerLvl() {
        return hpregenPerLvl;
    }

    public int getMpregen() {
        return mpregen;
    }

    public int getMpregenPerLvel() {
        return mpregenPerLvel;
    }

    public int getCrit() {
        return crit;
    }

    public int getCritPerLvl() {
        return critPerLvl;
    }

    public int getAd() {
        return ad;
    }

    public int getAdPerLvl() {
        return adPerLvl;
    }

    public int getAsPerLvl() {
        return asPerLvl;
    }

    public int getAs() {
        return as;
    }
}
