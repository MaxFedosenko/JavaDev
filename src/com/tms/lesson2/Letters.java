package com.tms.lesson2;

import java.util.Objects;
import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
//гласная или согласная через switch
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        switch (x) {
            case "e":
                System.out.println("гласная");
                break;
            case "y":
                System.out.println("гласная");
                break;
            case "u":
                System.out.println("гласная");
                break;
            case "i":
                System.out.println("гласная");
                break;
            case "o":
                System.out.println("гласная");
                break;
            case "a":
                System.out.println("гласная");
                break;
            default:
                System.out.println("согласная");
        }

//гласная или согласная через if
        Scanner console = new Scanner(System.in);
        String y = console.nextLine();
        if (Objects.equals(y, "e")) {
            System.out.println("гласная");
        } else if (Objects.equals(y, "y")) {
            System.out.println("гласная");
        } else if (Objects.equals(y, "u")) {
            System.out.println("гласная");
        } else if (Objects.equals(y, "i")) {
            System.out.println("гласная");
        } else if (Objects.equals(y, "o")) {
            System.out.println("гласная");
        } else if (Objects.equals(y, "a")) {
            System.out.println("гласная");
        } else {
            System.out.println("согласная");
        }
    }
}
