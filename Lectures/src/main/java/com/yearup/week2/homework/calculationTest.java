package com.yearup.week2.homework;

public class calculationTest {

    public static void main(String[] args) {
        calcImp object = new calcImp();
        final double length = object.getInput();

        final double area = object.calculateArea(length, length);
        object.displayArea();

        Planet planetName  = new Planet();
        Planet planetRadius  = new Planet();

    }


}
