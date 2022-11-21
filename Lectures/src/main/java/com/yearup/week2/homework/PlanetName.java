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

        if(planeName.equals("Mercury")) {
            return 0;
        }
        else if(planeName.equals("Venus")) {
            return 0;
        }

        else if(planeName.equals("Earth")) {
            return 1;
        }
        else if(planeName.equals("Mars")) {
            return 2;
        }
        else if(planeName.equals("Jupiter")) {
            return 80;
        }
        else if(planeName.equals("Saturn")) {
            return 83;
        }
        else if(planeName.equals("Uranus")) {
            return 27;
        }
        else if(planeName.equals("Neptune")) {
            return 1;
        }
        return 0;
    }

}
