package com.company;

import java.awt.*;

public final class Painter extends Canvas {
    private Circle[] circles;
    private double pow;

    public Painter(double pow) {
        this.pow = pow;
    }

    public Painter() {
    }


    public Painter(Circle[] circles) {
        this.circles = circles;
    }

    @Override
    public void paint(Graphics g) {
        // drawCircle(g,circles);
        drawPanel(g);
        drawParabola(g, pow);
    }

    public void drawParabola(Graphics g, double pow) {
        g.setColor(Color.RED);
        for (double x = -100; x <= 100; x = x + 0.1) {
            double y = Math.pow(x, pow);
            int X = (int) Math.round(250 + x * 20);
            int Y = (int) Math.round(250 - y * 10);
            System.out.println("X: " + x + ", Y:" + y);
            g.fillOval(X - 2, Y - 2, 4, 4);
        }
    }


    public void drawPanel(Graphics graphics) {
        graphics.drawLine(Main.frameSizeHeight / 2, 0, Main.frameSizeWidth / 2, Main.frameSizeHeight);
        graphics.drawLine(0, Main.frameSizeHeight / 2, Main.frameSizeWidth, Main.frameSizeHeight / 2);
    }

    public void drawCircle(Graphics graphics, Circle[] circles) {
        for (Circle c : circles) {
            setColor(c.getColor(), graphics);
            graphics.fillOval(c.getX(), c.getY(), (int) c.getRadius(), (int) c.getRadius());

        }

    }

    private void setColor(String color, Graphics graphics) {
        switch (color) {
            case "RED":
                graphics.setColor(Color.RED);
                break;
            case "BLUE":
                graphics.setColor(Color.BLUE);
                break;
            case "CYAN":
                graphics.setColor(Color.CYAN);
                break;
            default:
                graphics.setColor(Color.BLACK);
        }
    }
}
