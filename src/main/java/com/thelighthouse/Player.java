package com.thelighthouse;

public class Player {

    private String name;
    private int health;
    private int sanity;
    private int strength;
    private int endurance;
    private int dexterity;
    private int wisdom;


    private int level;
    private int saveSlot;
    private int progress;

    public Player() {
    }
    public Player(String name, int health, int sanity, int strength, int endurance, int dexterity, int wisdom, int level, int saveSlot, int progress) {
        this.name = name;
        this.health = health;
        this.sanity = sanity;
        this.strength = strength;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.level = level;
        this.saveSlot = saveSlot;
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSaveSlot() {
        return saveSlot;
    }

    public void setSaveSlot(int saveSlot) {
        this.saveSlot = saveSlot;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}