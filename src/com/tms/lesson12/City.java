package com.tms.lesson12;

public class City {

    private String name;
    private Street street;

    public City(String name, Street street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", street=" + street +
                '}';
    }
}
