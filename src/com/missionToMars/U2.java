package com.missionToMars;
/**
 * This class represents the U2 prototype
 * @author Misael Mondragon
 */

import java.util.Random;

public class U2 extends Rocket {
    // Constructor
    public U2(){
        cost = 120000000;
        weight = 18*1000;
        maxWeight=29*1000;
    }

    @Override
    public boolean land() {
        //probability Equation
        launchExplosion = 4*(this.getCurrentWeightCarried()/8000);
        // Random number
        int random = getRandomNumber();
        // landing response
        if (launchExplosion >=random){
            return false;
        }else {
            return super.land();
        }

    }

    @Override
    public boolean launch() {
        //probability equation
        landingCrash = 8*(this.getCurrentWeightCarried()/8000);
        // Random number
        int random = getRandomNumber();
        if (landingCrash>=random){
            return false;
        }else{
            return super.launch();
        }

    }

    public int getRandomNumber(){
        Random randomNumber = new Random();
        int random=randomNumber.nextInt(100);
        return random;
    }
}
