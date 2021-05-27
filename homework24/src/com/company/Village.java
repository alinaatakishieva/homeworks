package com.company;

public class Village extends AbstractLocality{ // Village class extends AbstractLocality class
    public Village(String adviser, String name, double area, double population) {
        super(adviser, name, area, population);
    } // extended constructor

//    @Override
//    public String toString(){
//        return String.format("Village Name: %s, \nArea: %s, \nAdviser: %s, Population: %s", getName(), getArea(), getAdviser(), getPopulation());
//    }
}
