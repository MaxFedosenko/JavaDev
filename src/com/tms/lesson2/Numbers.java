package com.tms.lesson2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //числа в промежутке
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int num = a; num < b; num++) {
            if (num % 3 == 0) {
                sum += num;
                System.out.println("числа, которые делятся на 3 в данном промежутке: " +num);
            }
        }
        System.out.println("сумма чисел кратных трем равна: " + sum);
    }
}
