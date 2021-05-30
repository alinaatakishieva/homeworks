package com.company;

import javax.swing.*;


public class Main {
    static int frameSizeWidth = 500;
    static int frameSizeHeight = 500;

    public static void main(String[] args) {
        Circle circle = new Circle(100, 100, 50, "RED");
        Circle circle1 = new Circle(400,100,50,"BLUE");
        Circle circle2 = new Circle(100,400,50,"CYAN");
        Circle circle3 = new Circle(400,400,50,"drugoe");
        Painter painter = new Painter(new Circle[]{circle, circle1, circle2, circle3});


        Painter parabola2 = new Painter(2);
        Painter parabola3 = new Painter(3);

        createFrame(parabola2);
        createFrame(parabola3);

    }

    private static void createFrame(Painter painter){
        JFrame frame = new JFrame();
        frame.setSize(frameSizeWidth,frameSizeHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(painter);
        frame.setVisible(true);
    }
}
