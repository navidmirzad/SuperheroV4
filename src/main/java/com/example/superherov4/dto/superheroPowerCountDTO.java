package com.example.superherov4.dto;

public class superheroPowerCountDTO {

    private int hero_id;
    private String superheroName;
    private String realName;
    private int superheroPowerCount;

    public superheroPowerCountDTO(int hero_id, String superheroName, String realName, int superheroPowerCount) {
        this.hero_id = hero_id;
        this.superheroName = superheroName;
        this.realName = realName;
        this.superheroPowerCount = superheroPowerCount;
    }

    public int getHero_id() {
        return hero_id;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getSuperheroPowerCount() {
        return superheroPowerCount;
    }

}
