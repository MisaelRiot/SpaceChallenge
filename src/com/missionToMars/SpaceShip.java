package com.missionToMars;

/**
 * This interface includes the definitions for the methods
 * launch
 * land
 * canCarry
 * carry
 * @author Misael Mondragon
 */
public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item item);
    void carry(Item item);
}
