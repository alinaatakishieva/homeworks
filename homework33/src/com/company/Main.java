package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        YearMonths[] arrayMonths = new YearMonths[YearMonths.values().length];

        for (int i = 0; i < arrayMonths.length; i++) {
            arrayMonths[i] = YearMonths.getRandomYearMonths();
        }

        System.out.println("Array with random months" + Arrays.toString(arrayMonths));
        sortYearMonths(Arrays.asList(arrayMonths));
        System.out.println("Sorted array months" + Arrays.toString(arrayMonths));


        List<YearMonths> arrayListMonth = new ArrayList<>();

        fillWithRandomValues(arrayListMonth);

        System.out.println("Random months in ArrayList " + arrayListMonth);

        sortYearMonths(arrayListMonth);
        System.out.println("Sorted random ArrayList of months " + arrayListMonth);

        List<YearMonths> linkedListMonths = new LinkedList<>();

        fillWithRandomValues(linkedListMonths);

        System.out.println("Random month in LinkedList" + linkedListMonths);
        sortYearMonths(linkedListMonths);
        System.out.println("Sorted random LinkedList of months " + linkedListMonths);




    }

    public static List<YearMonths> fillWithRandomValues(List<YearMonths> months){

        for (int i = 0; i <= YearMonths.values().length; i++) {
            months.add(YearMonths.getRandomYearMonths());
        }
        return months;
    }


    public static List<YearMonths> sortYearMonths(List<YearMonths> months){
        Collections.sort(months);
        return months;
    }
}
