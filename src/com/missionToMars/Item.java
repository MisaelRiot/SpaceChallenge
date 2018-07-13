package com.missionToMars;

/**
 * This class represents an Item to be loaded in a rocket
 *
 * @author Misael Mondragon
 */
public class Item {

    //Class's native variables

    private String name;
    private int weight;

    //constructor
    public Item(){

    }
    // methods

    /**
     * Gives a name to an Item
     * @param name name of the Item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the name of the Item
     * @return the name of the Item
     */
    public String getName() {
        return name;
    }

    /**
     * gives a weight to the Item
     * @param weight weight of the Item
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

}
