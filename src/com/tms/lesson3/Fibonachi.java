package com.tms.lesson3;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        int [] fibonachi = new int [10];
        for (int i = 0; i < fibonachi.length; i++){
            if (i < 2) {
                fibonachi [i] = 1;
            } else {
                fibonachi [i] = fibonachi[i-2] + fibonachi[i-1];
            }
        }
        System.out.println(Arrays.toString(fibonachi));
    }
}
