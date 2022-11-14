package com.yearup.week2.homework;

import java.util.Scanner;

public class Executor {

    Scanner sc;
    private SolarSystemPlanet ssp;

    public Executor() {
        ssp = new SolarSystemPlanet();
    }

    public static void main(String[] args) {

        Executor ex = new Executor();

        String inputValue = ex.getInput();

        System.out.println(inputValue);


        Double r = ex.getRadius();
        double a = ex.ssp.calculateArea(r, r);

        ex.disp(a);
        ex.disp2();
        ex.getPosition();


    }

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the planet name : ");
        String inputValue = sc.nextLine();

        return inputValue;
    }

    public double getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the planet radius : ");
        double GivenValue = sc.nextDouble();

        return GivenValue;
    }

    void disp(double a) {
        System.out.println("Area of the planet is :" + a);
    }

    void disp2() {
        ssp.displayArea();
    }

    void getPosition() {
        int position = ssp.PlanetPosition("Uranus");

        System.out.println("The position of the planet is: " + position);


    }


}

