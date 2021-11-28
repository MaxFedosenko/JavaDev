package com.tms.lesson1;

public class TousandsHundredsTensUnits {
    public static void main(String[] args) {
//тысячи, сотни, десятки и единицы
        int x = 6547;
        int a = x/1000;
        int b = (x/100)%10;
        int c = (x/10)%10;
        int d = x%10;
        System.out.println("в числе " + x + " " + a + " тысяч " + b + " сотен " + c + " десятков и " + d + " единиц");
    }
}
