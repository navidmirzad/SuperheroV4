package com.example.superherov4.dto;

public class SuperheroDTO {

    private int hero_id;
    private String superheroName;
    private String realName;
    private int power_id;
    private int discoveryYear;
    private String isHuman;
    private int strength;
    private int city_id;

    public SuperheroDTO(int hero_id, String superheroName, String realName, int power_id,
                        int discoveryYear, String isHuman, int strength, int city_id) {
        this.hero_id = hero_id;
        this.superheroName = superheroName;
        this.realName = realName;
        this.power_id = power_id;
        this.discoveryYear = discoveryYear;
        this.isHuman = isHuman;
        this.strength = strength;
        this.city_id = city_id;
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

    public int getPower_id() {
        return power_id;
    }

    public int getDiscoveryYear() {
        return discoveryYear;
    }

    public String getIsHuman() {
        return isHuman;
    }

    public int getStrength() {
        return strength;
    }

    public int getCity_id() {
        return city_id;
    }
}
