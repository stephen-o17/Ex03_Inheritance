package com.qa;

public class Rectangle extends Shape{
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString(){
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}

