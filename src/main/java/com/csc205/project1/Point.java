package com.csc205.project1;

//Name: Phillip Eierdam
//Project: Lets Get to the Point
//Date: 2/2/2022

public class Point {

    private double x, y;

    public Point(){
        x= 0;
        y= 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "Point: " + "\nX= " + x + "\nY= " + y;
    }

    public double distance(Point point){
        double distance = Math.sqrt(Math.pow((this.x-point.getX()),2) + Math.pow((this.y-point.getY()), 2));
        return distance;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setPoint(double new_X, double new_Y){
        this.x = new_X;
        this.y = new_Y;
    }

    public void shiftX(double distance){
        this.x += distance;
    }

    public void shiftY(double distance){
        this.y += distance;
    }

    public void rotate(double radian){
        this.x = (x*(Math.cos(radian)))-(y*(Math.sin(radian)));
        this.y = (x*(Math.sin(radian)))+(y*(Math.cos(radian)));
    }

}
