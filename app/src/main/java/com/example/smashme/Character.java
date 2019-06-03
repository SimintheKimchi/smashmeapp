package com.example.smashme;

import java.util.List;

public class Character {
    private String currentCharacter;
    private int currentCharNumber;

    private List<Information> info;

    private String image;
    private String name;
    private String weightclass;
    private String playtype;
    private String instructions;
    private String combos;
    private int currentCharNumb;

    public Character(List<Information> info) {
        this.currentCharacter = currentCharacter;
        this.currentCharNumber = currentCharNumber;
        this.info = info;
        this.image = image;
        this.name = name;
        this.weightclass = weightclass;
        this.playtype = playtype;
        this.instructions = instructions;
        this.combos = combos;
        this.currentCharNumb = currentCharNumb;
    }

    public String getCurrentCharacter() {
        return currentCharacter;
    }

    public void setCurrentCharacter(String currentCharacter) {
        this.currentCharacter = currentCharacter;
    }


    public int getCurrentCharNumber(){
        return currentCharNumber;
    }

    public void setCurrentCharNumber(){
        this.currentCharNumber = currentCharNumber;
    }


    public List<Information> getInfo() {
        return info;
    }

    public void setInfo(List<Information> info) {
        this.info = info;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeightclass() {
        return weightclass;
    }

    public void setWeightclass(String weightclass) {
        this.weightclass = weightclass;
    }

    public String getPlaytype() {
        return playtype;
    }

    public void setPlaytype(String playtype) {
        this.playtype = playtype;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getCombos() {
        return combos;
    }

    public void setCombos(String combos) {
        this.combos = combos;
    }

    public int getCurrentCharNumb() {
        return currentCharNumb;
    }

    public void setCurrentCharNumb(int currentCharNumb) {
        this.currentCharNumb = currentCharNumb;
    }

    @Override
    public String toString() {
        return "Character{" +
                "currentCharacter='" + currentCharacter + '\'' +
                ", currentCharNumber=" + currentCharNumber +
                ", info=" + info +
                '}';
    }
}
