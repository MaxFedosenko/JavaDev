package com.tms.lesson15.entity;

public class Car {

    private int id;
    private String model;
    private TYPE type;
    private String year;

    public Car(int id, String model, TYPE type, String year) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public Car(String model, TYPE type, String year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", year='" + year + '\'' +
                '}';
    }
}
