package com.company;

public class Horse {
    private int weight;
    private int age;
    private String color;
    private boolean isMale;
    private String name;

    public Horse(){

    }

    public Horse(int weight, int age, String color, boolean isMale, String name) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.isMale = isMale;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        }
        else{
            System.out.println("Error!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Horse: " +
                "weight = " + weight +
                ", age = " + age +
                ", color = " + color + '\'' +
                ", isMale = " + isMale +
                ", name = " + name + "\n";
    }
}
