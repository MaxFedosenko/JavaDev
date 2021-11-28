package com.tms.lesson1;

public class Division {
    public static void main(String[] args) {
        //проверка на деление без остатка
        int x = 3;
        int y = 10;
        if (y % x == 0) {
            System.out.println(y + " делится на " + x + " без остатка и равно " + y / x);
        } else {
            System.out.println(y + " делить на " + x + " равно " + y / x + " целых и " + y % x + " остаток от деления");
        }
    }
}
