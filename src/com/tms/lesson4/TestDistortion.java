package com.tms.lesson4;

public class TestDistortion {
    public static void main(String[] args) {
        Distortion distortion = new Distortion("Max", 26);
        distortion.validate(distortion.age);
        distortion.validate(distortion.name);
    }
}
