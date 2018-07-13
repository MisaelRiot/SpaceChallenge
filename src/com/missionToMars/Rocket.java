package com.missionToMars;

/**
 * This class represents a Rocket to be loaded with Items
 * it implements
 * @author Misael Mondragon
 */
public class Rocket implements SpaceShip {
    /* using default access modifiers since private fields can't be accessed from child */
    int currentWeightCarried=0;
    long cost;
    int weight;
    int maxWeight;
    int launchExplosion;
    int landingCrash;

    //constructor

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean launch() {
        return true;
    }

    /**
     * This methods determines if an Item can be loaded to the Rocket
     * @param item The item to be loaded
     * @return true if it can be loaded, false otherwise
     */
    @Override
    public boolean canCarry(Item item) {
        int possibleWeight = item.getWeight()+currentWeightCarried;
        if (possibleWeight>=(maxWeight-weight)){
            return false;
        }else{
            return true;

        }

    }

    /**
     * This method updates the current weight of the Rocket
     * @param item the item that is going to be loaded.
     */
    @Override
    public void carry(Item item) {
        currentWeightCarried =+ item.getWeight();
        //System.out.println("el item a sido cargado: "+item.getName()+"= "+item.getWeight());
    }

    /**
     * this method returns the Rocket's current weight value
     * @return current weight value
     */
    public int getCurrentWeightCarried() {
        return currentWeightCarried;
    }
}
