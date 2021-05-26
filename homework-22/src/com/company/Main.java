package com.company;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit(1, 1000, "1.01.2020-1.01.2021", 23);
        Credit credit2 = new Credit(2, 2000, "3.03.2010-3.02.2011", 34);
        Credit credit3 = new Credit(3, 3000, "3.03.2010-3.02.2011", 21);
        Credit credit4 = new Credit(4, 4000, "3.03.2010-3.02.2011", 33);
        Credit credit5 = new Credit(5, 5000, "3.03.2010-3.02.2011", 25);


        System.out.println("Credit count: " + Credit.getCreditCount());
        System.out.println("Credit`s sum: " + Credit.getCountSum());
        System.out.println("Average sum: " + Credit.getCountSum()/Credit.getCreditCount());


    }
}
