package com.company;

public class Credit {
    private static int id;
    private static int sum;
    private String period;
    private int percent;

    private static int creditCount;
    private static int countSum;


    public Credit() {

    }

    public Credit(int id, int sum, String period, int percent) {
        Credit.id = id;
        Credit.sum = sum;
        this.period = period;
        this.percent = percent;
        creditCount++;
        countSum += sum;
    }

    public static int getCreditCount(){
        return creditCount;
    }

    public static int getCountSum(){
        return countSum;
    }

}
