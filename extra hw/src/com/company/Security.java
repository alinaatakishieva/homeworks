package com.company;

public class Security extends Colleague {
    private boolean isArmed;
    private String gunType;

    public Security() {

    }

    public Security(boolean isArmed, String gunType) {
        this.isArmed = isArmed;
        this.gunType = gunType;
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
        isArmed = armed;
    }

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }


    public String faceControl() {
        return "U can`t enter!";
    }

    public String driveOut() {
        return "\nGo out, please!";
    }

    @Override
    public String toBeLate(){
        return "late for 1 hour, uvolen!";
    }
}
