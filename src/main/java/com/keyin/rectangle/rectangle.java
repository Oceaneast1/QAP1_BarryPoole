package com.keyin.rectangle;

public class rectangle {

    private double length;
    private double width;


    public void setLength (double len) {
        length = len;
    }

    public void setWidth(double w){
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return  length * 2 + width * 2;
    }


    public boolean length(double i) {

        return true;
    }

    public boolean width(double i) {

        return false;
    }

    public double area(double i, double i1) {

        return i * i1;
    }

    public double perimeter(double i, double i1) {

        return (i * 2) + (i1 * 2);

    }
}