package com.company;

public abstract class AbstractLocality {  // abstract class means that u have to create other class on its basis
    private String adviser; // svoistvo adviser
    private String name; // svoistvo locality name
    private double area; // locality area
    private double population; // locality population

    public AbstractLocality(){

    } // default constructor

    public AbstractLocality(String adviser, String name, double area, double population) {
        this.adviser = adviser;
        this.name = name;
        this.area = area;
        this.population = population;
    }  // constructor

    public String getAdviser(){
        return adviser;
    }

    public  String getName(){
        return name;
    }

//    public String getAdviser() {
//        return adviser;
//    }
//
//    public void setAdviser(String adviser) {
//        this.adviser = adviser;
//    }
//
//    public static String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        AbstractLocality.name = name;
//    }
//
//    public double getArea() {
//        return area;
//    }
//
//    public void setArea(double area) {
//        this.area = area;
//    }
//
//    public double getPopulation() {
//        return population;
//    }
//
//    public void setPopulation(double population) {
//        this.population = population;
//    }
}
