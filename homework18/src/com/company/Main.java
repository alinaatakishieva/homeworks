package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep(60, 3, true, "Baran");
        Sheep sheep2 = new Sheep(45, 2, false, "Ovca");
        Sheep sheep3 = new Sheep(100, 10, true, "Kochkor");

//        Sheep sheep1 = new Sheep();
//        sheep1.setWeight(60);
//        sheep1.setAge(2);
//        sheep1.setMale(true);
//        sheep1.setName("Baran");

        Cow cow1 = new Cow(90, 3, true, "Byk");
        Cow cow2 = new Cow(110, 4, true, "Byk2");
        Cow cow3 = new Cow(25, 1, false, "Burenka");
        Cow cow4 = new Cow(60, 2, true, "Ne sushestvuet");
        Cow cow5 = new Cow(46, 2, false, "Dusya");

//        Cow cow1 = new Cow();
//        cow1.setAge(-2);
//        cow1.setName("Burenka");
//        cow1.setMale(false);
//        cow1.setWeight(69);

        Horse horse1 = new Horse(100, 2, "black", true, "Tygydyk");
        Horse horse2 = new Horse(150, 4, "white", false, "Loshadka");

//        Horse horse1 = new Horse();
//        horse1.setAge(2);
//        horse1.setColor("white");
//        horse1.setMale(true);
//        horse1.setName("Tygydyk");
//        horse1.setWeight(100);

        Farm farm1 = new Farm();
        farm1.setAddress("Belovodskoe");
        Sheep[] otara = {sheep1, sheep2, sheep3};
        farm1.setOtara(otara);
        Cow[] herd = {cow1, cow2, cow3, cow4, cow5};
        farm1.setHerd(herd);
        Horse[] tabun = {horse1, horse2};
        farm1.setTabun(tabun);
        farm1.setFarmerFullName("Atakishieva Alina");
        System.out.println("Address of farm1: " + farm1.getAddress());
        System.out.println("Owner of farm1: " + farm1.getFarmerFullName());
        System.out.println(herd.length + " cows in farm1 \n" + otara.length + " sheeps in farm1 \n" + tabun.length + " horses in farm1");
        System.out.println(Arrays.toString(farm1.getOtara()));
        System.out.println(Arrays.toString(farm1.getTabun()));
        System.out.println(Arrays.toString(farm1.getHerd()));

        System.out.println("'''''''''''''''''''''''''''''''''''''''");

        Farm farm2 = new Farm();
        farm2.setAddress("Toktogul");
        farm2.setFarmerFullName("Edvard Kalin");
        Horse[] tabun2 = {horse1};
        farm2.setTabun(tabun2);
        Cow[] herd2 = {cow1};
        farm2.setHerd(herd2);
        Sheep[] otara2 = {sheep1};
        farm2.setOtara(otara2);

        System.out.println("Address of farm2: " + farm2.getAddress());
        System.out.println("Owner of farm2: " + farm2.getFarmerFullName());
        System.out.println(herd2.length + " cows in farm2 \n" + otara2.length + " sheeps in farm2 \n" + tabun2.length + " horses in farm2");
        System.out.println(Arrays.toString(farm2.getOtara()));
        System.out.println(Arrays.toString(farm2.getTabun()));
        System.out.println(Arrays.toString(farm2.getHerd()));


    }

}
