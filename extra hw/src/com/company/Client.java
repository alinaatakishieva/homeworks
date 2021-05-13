package com.company;

public class Client extends Person {
    private boolean isRegular;
    private int averageOrder;
    private boolean faceControl;

    public Client() {
    }

    public Client(String name, int age, String address, boolean isMale) {
        super(name, age, address, isMale);
    }


    public boolean isIeRegular() {
        return isRegular;
    }

    public void setIeRegular(boolean ieRegular) {
        this.isRegular = isRegular;
    }

    public int getAverageOrder() {
        return averageOrder;
    }

    public void setAverageOrder(int averageOrder) {
        this.averageOrder = averageOrder;
    }

    public boolean isFaceControl() {
        return faceControl;
    }

    public void setFaceControl(boolean faceControl) {
        if (faceControl==true)
        {
            this.faceControl = faceControl;
        }
        else {
            System.out.println("U can`t enter!");
        }
    }



    public String order(){
        return "I wanna order...";
    }

    public String pay(){
        return "\nI wanna pay...";
    }

    public String callWaiter(){
        return "\nWaiter...";
    }
}
