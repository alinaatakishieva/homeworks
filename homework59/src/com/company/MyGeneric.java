package com.company;

public class MyGeneric <F, S> {
    private F first;
    private S second;

    public MyGeneric(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public String firstInfo(){
        return first.getClass() + "-> " + first.hashCode();
    }

    public String secondInfo(){
        return second.getClass() + "-> " + second.hashCode();
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public boolean check(){
        if (first.getClass().equals(second.getClass()) && first.hashCode()==second.hashCode())
            return true;
        else return false;
    }
}
