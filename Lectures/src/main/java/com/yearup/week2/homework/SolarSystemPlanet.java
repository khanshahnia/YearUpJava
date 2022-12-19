package com.yearup.week2.homework;

public class SolarSystemPlanet extends Planet {


    private String StarOfTheSolarSystem = "SUN";   //member variable

    protected String getStar() {//method to access star from subclass with string return type


        return StarOfTheSolarSystem; //override the Star from planet method
    }


    public int PlanetPosition(String names) {

        switch (names) {

            case "Mercury":
                return 1;
            case "Venus":
                return 2;
            case "Earth":
                return 3;
            case "Mars":
                return 4;
            case "Jupiter":
                return 5;
            case "Saturn":
                return 6;
            case "Uranus":
                return 7;
            case "Neptune":
                return 8;

        }

        return 0;
    }


}
