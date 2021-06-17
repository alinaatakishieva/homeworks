package com.company.taskA;

import java.util.List;

public class Cat {
    int numberCat;

    public Cat(int numberCat) {
        this.numberCat = numberCat;
    }

    @Override
    public String toString() {
        return this.numberCat + "";
    }

    public static long add100CatsToTheMiddle(List<Cat> list, String nameOfList) {
        long millisBefore = System.currentTimeMillis();
        for (int i = 100; i >= 1; i--) {
            list.add(10 / 2, new Cat(i));
        }
        long millisAfter = System.currentTimeMillis();
        System.out.println("time for adding 100 cats to the middle of the " + nameOfList +
                ":" + (millisAfter - millisBefore));
        return millisAfter - millisBefore;
    }

    public static long add100CatsToBeginEnd(List<Cat> list, String nameOfList) {
        long millisBefore = System.currentTimeMillis();
        for (int i = 100; i >= 1; i--) {
            list.add(0, new Cat(i));
            list.add(list.size(), new Cat(i));
        }
        long millisAfter = System.currentTimeMillis();
        System.out.println("time for adding 100 cats to the begin and to the end of " + nameOfList +
                ": " + (millisAfter - millisBefore));
        return millisAfter - millisBefore;
    }

    public static long getMidLastElement(List<Cat> list, String nameOfList){
        long millisBefore = System.currentTimeMillis();
        list.get(list.size() / 2);
        list.get(list.size() - 1);
        long millisAfter = System.currentTimeMillis();
        System.out.println("time for getting mid and last elements of " + nameOfList +
                ": " + (millisAfter - millisBefore));
        return millisAfter - millisBefore;
    }

    public static long removeFromTheBeginMid(List<Cat> list, String nameOfList){
        long millisBefore = System.currentTimeMillis();
        list.remove(0);
        list.remove(list.size() / 2);
        long millisAfter = System.currentTimeMillis();
        System.out.println("time for remove from the begin and middle of " + nameOfList +
                ": " + (millisAfter - millisBefore));
        return millisAfter - millisBefore;
    }


    public int getNumberCat() {
        return numberCat;
    }

    public void setNumberCat(int numberCat) {
        this.numberCat = numberCat;
    }
}
