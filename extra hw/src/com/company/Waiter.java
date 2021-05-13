package com.company;

public class Waiter extends Colleague{
    public String takeOrder(){
        return "What do u wanna order?";
    }

    public String placeOrder(){
        return "\nThat is your dish, enjoy your meal!";
    }

    public String count(){
       return "\nVash schet";
    }

    @Override
    public String toBeLate(){
        return "late for 5 min, shtraf 300 som";
    }
}
