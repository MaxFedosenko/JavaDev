package com.tms.lesson12;

public class Region {

private String name;
private City city;

    public Region(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
