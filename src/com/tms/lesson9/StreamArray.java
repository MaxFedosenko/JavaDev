package com.tms.lesson9;

import java.util.Arrays;

public class StreamArray {

    public static void main(String[] args) {

        int [] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println("our array is " + Arrays.toString(array));
        System.out.println("_____________________________________________");

        int max = Arrays.stream(array)
                .max().getAsInt();
        System.out.println("max value is " + max);
        System.out.println("_______________________________________________");

        int min = Arrays.stream(array)
                .min().getAsInt();
        System.out.println("min value is " + min);
        System.out.println("_______________________________________________");

        int sum = Arrays.stream(array)
                .filter(value -> value % 2 == 0)
                .sum();
        System.out.println("sum of even values is " + sum);
        System.out.println("_________________________________________________");


        Arrays.stream(array)
                .skip(4)
                .forEach(System.out::println);

    }

}
