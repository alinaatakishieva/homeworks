package com.company;

public class Person {
    private String name;
    private int age;
    private String address;
    private boolean isMale;

    public Person() {

    }

    public Person(String name, int age, String address, boolean isMale) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isMale = isMale;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) System.out.println("Error!");
        else this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }


}
