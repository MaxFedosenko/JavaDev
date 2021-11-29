package com.tms.lesson4;

public enum MONTHS {
    JANUARY("winter"),
    FEBRUARY("winter"),
    MARCH("spring"),
    APRIL("spring"),
    MAY("spring"),
    JUNE("summer"),
    JULE("summer"),
    AUGUST("summer"),
    SEPTEMBER("autumn"),
    OCTOBER("autumn"),
    NOVEMBER("autumn"),
    DECEMBER("winter");

    public String season;

    MONTHS(String season) {
        this.season = season;
    }
}
