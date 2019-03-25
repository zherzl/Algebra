package com.zadaci.v04;

import java.awt.Color;

class Prozor {

    private Point topLeft, bottomRight;
    private String title, label;
    private Boja color;
    private boolean isActive;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Boja getBoja() {
        return color;
    }

    public void setBoja(Boja color) {
        this.color = color;
    }

    public boolean getIsIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Prozor() {
        this.label = "Prozor 1";
        this.topLeft = new Point(0, 0);
        this.bottomRight = new Point(85, 25);
    }


    public Prozor(String title, Point topLeft, Point bottomRight, Boja color) {
        this.title = title;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = color;
    }

    public Prozor(String title, String label, Point topLeft, Point bottomRight, Boja color, boolean isActive) {
        this(title, topLeft, bottomRight, color);
        this.label = label;
        this.isActive = isActive;
    }

    public int width() {
        return Math.abs(topLeft.getX() - bottomRight.getY());
    }

    public int height() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public int area() {
        return height() * width();
    }

    public int perimeter() {
        return 2 * (width() * height());
    }

    public void drawFill() {
        for (int i = 0; i < height(); i++) {
            for (int j = 0; j < width(); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void drawBorder() {
        for (int i = 0; i < height(); i++) {
            for (int j = 0; j < width(); j++) {
                if (i == 0 || j == 0 || i == height() - 1 || j == width() - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public void ispisiProzor() {
        System.out.println("Naslov: " + title);
        System.out.println("Oznaka: " + label);
        System.out.println("Point 1: " + topLeft.getX() + " " + topLeft.getY());
        System.out.println("Point 2: " + bottomRight.getX() + " " + bottomRight.getY());
        System.out.println("Boja: " + color.getR() + " " + color.getG() + " " + color.getB());
        System.out.println("Aktivan: " + (isActive ? "Da" : "Ne"));
    }
}
