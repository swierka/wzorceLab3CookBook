package com.ebookfrenzy.cookbook.entity;

/**
 * Created by Alicja on 26.11.2017.
 */

public class Recipe {
    private String name;
    private String description;
    private Boolean isMeat;

    public Recipe(String name, String description, Boolean isMeat) {
        this.name = name;
        this.description = description;
        this.isMeat = isMeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getMeat() {
        return isMeat;
    }

    public void setMeat(Boolean meat) {
        isMeat = meat;
    }

    @Override
    public String toString() {
        String typDania = null;

        if(isMeat ==true){
            typDania="danie mięsne";
        } else {typDania = "danie wegetariańskie";}

        return name+" ("+typDania+"): "+description;
    }
}
