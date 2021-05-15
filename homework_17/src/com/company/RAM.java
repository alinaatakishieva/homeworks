package com.company;

public class RAM {
    private int volume;
    private String producer;

    public RAM(){

    }

    public RAM(int volume, String producer) {
        this.volume = volume;
        this.producer = producer;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


}
