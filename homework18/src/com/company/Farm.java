package com.company;

public class Farm {
    private String address;
    private Cow[] herd;
    private Sheep[] otara;
    private Horse[] tabun;
    private String farmerFullName;

    public Farm(){

    }

    public Farm(String address, Cow[] herd, Sheep[] otara, Horse[] tabun, String farmerFullName) {
        this.address = address;
        this.herd = herd;
        this.otara = otara;
        this.tabun = tabun;
        this.farmerFullName = farmerFullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getHerd() {
        return herd;
    }

    public void setHerd(Cow[] herd) {
        this.herd = herd;
    }

    public Sheep[] getOtara() {
        return otara;
    }

    public void setOtara(Sheep[] otara) {
        this.otara = otara;
    }

    public Horse[] getTabun() {
        return tabun;
    }

    public void setTabun(Horse[] tabun) {
        this.tabun = tabun;
    }

    public String getFarmerFullName() {
        return farmerFullName;
    }

    public void setFarmerFullName(String farmerFullName) {
        this.farmerFullName = farmerFullName;
    }
}
