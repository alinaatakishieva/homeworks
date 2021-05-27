package com.company;

public class City extends AbstractLocality { //city class extends AbstractLocality class. (nasledovanie)
    District[]array;

    public City(String adviser, String name, double area, double population, District[] array) {
        super(adviser, name, area, population);
        this.array = array;
    } // extended constructor
}
