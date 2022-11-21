package com.yearup.week2.homework;

public enum PlanetName {
    Mercury(0),
    Venus(0),
    Earth(1),
    Mars(2),
    Jupiter(80),
    Saturn(83),
    Uranus(27),
    Neptune(1);

    public final int moon;
    PlanetName(int moon) {
        this.moon = moon;
    }

    public static int getMoonCount(String planeName){

        if(planeName == "Mercury") {
            return 0;
        }
        else if(planeName == "Venus") {
            return 0;
        }

        else if(planeName == "Earth") {
            return 1;
        }

        return 0;
    }

}
