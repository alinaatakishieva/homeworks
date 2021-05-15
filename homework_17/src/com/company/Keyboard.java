package com.company;

public class Keyboard {

    private boolean isBacklighting;
    private boolean isExtraInt;

    public Keyboard(){

    }

    public Keyboard(boolean isBacklighting, boolean isExtraInt) {
        this.isBacklighting = isBacklighting;
        this.isExtraInt = isExtraInt;
    }

    public boolean isBacklighting() {
        return isBacklighting;
    }

    public void setBacklighting(boolean backlighting) {
        isBacklighting = backlighting;
    }

    public boolean isExtraInt() {
        return isExtraInt;
    }

    public void setExtraInt(boolean extraInt) {
        isExtraInt = extraInt;
    }
}
