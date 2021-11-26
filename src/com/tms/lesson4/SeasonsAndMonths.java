package com.tms.lesson4;

public class SeasonsAndMonths {
    public static void main(String[] args) {

        SwitchSeasons switchSeasons = new SwitchSeasons();
        switchSeasons.Seasons(MONTHS.NOVEMBER);

        //OR

        MONTHS months = MONTHS.AUGUST;
        switch (months) {
            case DECEMBER:
                System.out.println(SEASONS.WINTER);
                break;
            case JANUARY:
                System.out.println(SEASONS.WINTER);
                break;
            case FEBRUARY:
                System.out.println(SEASONS.WINTER);
                break;
            case MARCH:
                System.out.println(SEASONS.SPRING);
                break;
            case APRIL:
                System.out.println(SEASONS.SPRING);
                break;
            case MAY:
                System.out.println(SEASONS.SPRING);
                break;
            case JUNE:
                System.out.println(SEASONS.SUMMER);
                break;
            case JULE:
                System.out.println(SEASONS.SUMMER);
                break;
            case AUGUST:
                System.out.println(SEASONS.SUMMER);
                break;
            case SEPTEMBER:
                System.out.println(SEASONS.AUTUMN);
                break;
            case OCTOBER:
                System.out.println(SEASONS.AUTUMN);
                break;
            case NOVEMBER:
                System.out.println(SEASONS.AUTUMN);
                break;
        }
    }
}
