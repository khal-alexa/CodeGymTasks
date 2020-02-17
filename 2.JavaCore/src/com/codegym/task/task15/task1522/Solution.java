package com.codegym.task.task15.task1522;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = reader.readLine();
        } catch (IOException e) {

        }

        if (str.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        }
        else if (str.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (str.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
