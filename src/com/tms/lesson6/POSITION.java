package com.tms.lesson6;

public enum POSITION {
    WORKER(2),
    DIRECTOR(4);

    public int koef;

    POSITION(int koef) {
        this.koef = koef;
    }
}
