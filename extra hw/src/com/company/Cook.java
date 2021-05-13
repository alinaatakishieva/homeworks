package com.company;

import java.util.StringJoiner;

public class Cook extends Colleague {
    private String dishes;
    private String speciality;
    private String certificates;

    public Cook() {

    }

    public Cook(String dishes, String speciality, String certificates) {
        this.dishes = dishes;
        this.speciality = speciality;
        this.certificates = certificates;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }


    public String shopping() {
        return "I have bought products! ";
    }

    public String inventDishes() {
       return "\nI think it will be delicious, if i`ll mix honey with garlic!";
    }

    public String cookDishes() {
        return " \nIt`s cooked!";
    }

    @Override
    public String toBeLate(){
        return "late for 15 min, shtraf 1000 som";
    }
}
