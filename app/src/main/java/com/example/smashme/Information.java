package com.example.smashme;

public class Information {
    private String image;
    private String name;
    private String weightclass;
    private String playtype;
    private String instructions;
    private String combos;

    public Information(String image, String name, String weightclass, String playtype, String instructions, String combos) {
        this.image = image;
        this.name = name;
        this.weightclass = weightclass;
        this.playtype = playtype;
        this.instructions = instructions;
        this.combos = combos;
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

    @Override
    public String toString() {
        return "Information{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", weightclass='" + weightclass + '\'' +
                ", playtype='" + playtype + '\'' +
                ", instructions='" + instructions + '\'' +
                ", combos='" + combos + '\'' +
                '}';
    }
}
