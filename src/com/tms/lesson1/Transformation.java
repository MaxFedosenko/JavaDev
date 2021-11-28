package com.tms.lesson1;

public class Transformation {
    public static void main(String[] args) {
//преобразование
        char x = 'a';
        x++;
        int b = x;
        System.out.println(x);
        System.out.println(b);

        int z = 127;
        byte y = (byte) z;
        int a = 128;
        byte d = (byte) a;
        System.out.println(y);
        System.out.println(d);
    }
}
