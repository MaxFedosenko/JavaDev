package com.tms.lesson3;

import java.util.Arrays;

public class SumNumbers {
    public static void main(String[] args) {
        //сумма четных и нечетных номеров массива
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
        System.out.println(Arrays.toString(array));
        int sum2 = 0;
        for (int i =0; i < array.length; i += 2){
            int num2 = array[i];
            sum2 += array[i];
            System.out.println(num2);
        }
        System.out.println("сумма четных номеров: " + sum2);
        int sum1 = 0;
        for (int i = 1; i < array.length; i +=2){
            int num1 = array[i];
            sum1 += array[i];
            System.out.println(num1);
        }
        System.out.println("сумма нечетных номеров: " + sum1);
    }
}
