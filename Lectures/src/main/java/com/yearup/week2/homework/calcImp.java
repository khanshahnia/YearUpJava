package com.yearup.week2.homework;

import java.util.Scanner;

public class calcImp implements Calculator {

    private double returnValue;
    private double area_square;

    public calcImp() { //constructor

    }


    public double getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");

        double userInput = sc.nextInt();
        //System.out.println(userInput);

        //double area_square=userInput*userInput;
        //System.out.println("Area is: "+area_square);
        return userInput;
    }

    @Override
    public double calculateArea(double r, double y) {

        area_square = r * r;

        return 0;
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
        System.out.println("Area is: " + area_square);
    }

}
