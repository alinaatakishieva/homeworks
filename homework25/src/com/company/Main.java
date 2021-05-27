package com.company;

public class Main {

    public static void main(String[] args) {
	  //  Bakeable bread = new Bread(); // creating a new bread object
		Bread bread = new Bread(); // it`s possible to create new object by using Bakeable(interface) and Bread(class)
	    bread.bake(); // calling the bake method

	    Drawable circle = new Circle(); 
	    circle.draw();
    }
}
