package com.tms.lesson15.entity;

public enum TYPE {

    PASSENGER,
    TRUCK;

    public static TYPE getBool (boolean type){
        return type ? PASSENGER : TRUCK;
    }

}
