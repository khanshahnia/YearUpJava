package com.yearup.week2.homework;

public class Planet implements Calculator {

    protected String StarOfThePlanet;   //member variable
    protected String planetName;
    protected double planetRadius;
    protected double Area;


    protected String getStar() {//method to access star from subclass with string return type


        return StarOfThePlanet;
    }

    @Override
    public double calculateArea(double radius, double y) {
        Area = 3.14 * radius * radius;
        return Area;
    }

    @Override
    public double calculateSum(double i, double j) {
        return 0;
    }

    @Override
    public double calculateVolume(double s, double h, double k) {
        return 0;
    }

    public void displayArea() {
        System.out.println("Area for Planet Class is: " + Area);
    }
}


