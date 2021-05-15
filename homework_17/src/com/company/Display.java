package com.company;

public class Display {
    private int diagonal;
    private String producer;
    private String matrixType;

    public Display(){

    }

    public Display(int diagonal, String producer, String matrixType) {
        this.diagonal = diagonal;
        this.producer = producer;
        this.matrixType = matrixType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

}
