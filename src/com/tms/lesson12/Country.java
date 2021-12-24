package com.tms.lesson12;

public class Country {
    private String name;
    private Region region;

    public Country(String name, Region region) {
        this.name = name;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", region=" + region +
                '}';
    }
}
