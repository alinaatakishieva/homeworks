package com.company;

public class Dog {
    private String name;
    private int weight;

    public Dog(){}

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "\nMy name is : " + name + "\nmy weight is: " + weight + "kg";
    }

    @Override
    public int hashCode(){
        return this.weight + this.name.hashCode();
    }

    @Override
    public boolean equals(Object otherObject){
        return this.hashCode() == otherObject.hashCode();
    }
}
