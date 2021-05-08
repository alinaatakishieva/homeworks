package com.company;

public class Dog extends Animal{
    boolean isMale;
    boolean isWatchdog;

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isWatchdog() {
        return isWatchdog;
    }

    public void setWatchdog(boolean watchdog) {
        isWatchdog = watchdog;
    }

}
