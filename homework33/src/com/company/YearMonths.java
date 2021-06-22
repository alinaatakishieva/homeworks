package com.company;

import java.util.Random;

public enum YearMonths{
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static YearMonths getRandomYearMonths() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
