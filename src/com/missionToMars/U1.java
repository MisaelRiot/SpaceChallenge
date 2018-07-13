package com.missionToMars;
/**
 * This class represents the U1 rocket prototype
 * @author Misael Mondragon
 */

import java.util.Random;

public class U1 extends Rocket {
    // Class's Native Variables



    // Constructor

    public U1(){
        cost = 100000000;
        weight = 10*1000;
        maxWeight=18*1000;
    }

    /**
     * this method tells if the landing was successful
     * as long as the launchExplosion probability is less than a random number
     * @return true if it was, false if it wasn't.
     */
    @Override
    public boolean land() {
        //probability Equation
        launchExplosion = 5*(this.getCurrentWeightCarried()/8000);
        // Random number
        int random = getRandomNumber();
        // landing response
        if (launchExplosion >= random){
            return false;
        }else {
            return super.land();
        }

    }

    /**
     * This method evaluates if the launching was successful
     * as long as the landingCrash probability is less than a random number
     * @return true if it was, false if it wasn't.
     */
    @Override
    public boolean launch() {
        //probability equation
        landingCrash = 1*(this.getCurrentWeightCarried()/8000);
        // Random number
        int random = getRandomNumber();
        if (landingCrash >= random){
            return false;
        }else{
            return super.launch();
        }

    }

    /**
     * This method generates a random number
     * @return an integer between 0 and 99
     */
    public int getRandomNumber(){
        Random randomNumber = new Random();
        int random=randomNumber.nextInt(100);
        return random;
    }
}
