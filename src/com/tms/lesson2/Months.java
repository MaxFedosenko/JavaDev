package com.tms.lesson2;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        //какой месяц
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        switch (x) {
            case "december":
                System.out.println("winter");
                break;
            case "january":
                System.out.println("winter");
                break;
            case "february":
                System.out.println("winter");
                break;
            case "march":
                System.out.println("spring");
                break;
            case "april":
                System.out.println("spring");
                break;
            case "may":
                System.out.println("spring");
                break;
            case "june":
                System.out.println("summer");
                break;
            case "jule":
                System.out.println("summer");
                break;
            case "august":
                System.out.println("summer");
                break;
            case "september":
                System.out.println("autumn");
                break;
            case "october":
                System.out.println("autumn");
                break;
            case "november":
                System.out.println("autumn");
                break;
            default:
                System.out.println("ERROR!!! Check the spelling");
        }
    }
}
