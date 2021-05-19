package com.company;

public class Credit {
    private String id;
    private int sum;
    private String period;
    private int percent;

    public Credit(){

    }

    public Credit(String id, int sum, String period, int percent) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.percent = percent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }


}
