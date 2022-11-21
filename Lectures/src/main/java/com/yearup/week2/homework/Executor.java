package com.yearup.week2.homework;

import java.util.Scanner;

public class Executor {


    // Static nested class
    public static class NestedStaticClass {
        public void printMessage()
        {
            System.out.println("Your planet belongs to Milky way galaxy");
        }
    }




    Scanner sc;
    private SolarSystemPlanet ssp;

    public Executor() {
        ssp = new SolarSystemPlanet();
        sc = new Scanner(System.in);
    }


    public  void Compare(String userInput){

        PlanetName [] planetList =PlanetName.values();

        for(PlanetName planet : PlanetName.values()) {
            String name = planet.name();
            if(name.equals(userInput)){
                System.out.println("found user input in planet names");
                return;
            }
        }

        System.out.println("user input not found in planet names");

    }



    public void HW3(){
        Calculator displayCelestialobject = new Calculator() {
            @Override
            public double calculateArea(double x, double y) {
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
            @Override
            public void displayCelestialobject(){
                System.out.println("Comet is a celestial object");
            }

        };



        displayCelestialobject.displayCelestialobject();

        String userInput = getInput();
        int moon_count1 = PlanetName.getMoonCount(userInput);

        Compare(userInput);


//        System.out.println(moon);

    }


    public static void main(String[] args) {

        Executor ex = new Executor();
        ex.HW3();


//        String inputValue = ex.getInput();
//        Double r = ex.getRadius();
//        double a = ex.ssp.calculateArea(r, r);
//
//        ex.disp(a);
//        ex.disp2();
//        ex.getPosition();
//
//        System.out.println("Do u want any other planet?");
//
//        String responose = ex.sc.nextLine();
//
//        if (responose.equals("Yes")){
//            inputValue = ex.getInput();
//            r = ex.getRadius();
//            a = ex.ssp.calculateArea(r, r);
//            ex.disp(a);
//        }
//        else{
//            System.out.println("Thanks for using our planet application");
//            System.out.println("Goodbye!");
//        }


    }

    public String getInput() {
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
//Week 3 homework



}

