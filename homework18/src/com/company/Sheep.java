package com.company;

public class Sheep {
    private int weight;
    private int age;
    private boolean isMale;
    private String name;

    public Sheep() {

    }

    public Sheep(int weight, int age, boolean isMale, String name) {
        this.weight = weight;
        this.age = age;
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
        return "Sheep: " +
                "weight = " + weight +
                ", age = " + age +
                ", isMale = " + isMale +
                ", name = " + name + "\n";
    }
}
