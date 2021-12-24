package com.tms.lesson12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        LocalDate minus = localDate.minus(2, ChronoUnit.DAYS);
        System.out.println(minus);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);


    }

}
