package com.missionToMars;
/**
 * Main program
 *
 * @author Misael Mondragon
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String [] args) throws FileNotFoundException {
        long totalBudgetU1,totalBudgetU2;
        Simulation simulation = new Simulation();

        ArrayList phaseOneItems=simulation.loadItems("C:\\Users\\FAMILIA\\IdeaProjects\\SpaceChallenge\\src\\phase-1.txt"); //Replace phase depending on on path
        ArrayList phaseTwoItems=simulation.loadItems("C:\\Users\\FAMILIA\\IdeaProjects\\SpaceChallenge\\src\\phase-2.txt");

        ArrayList fleetU1Phase1 = simulation.loadU1(phaseOneItems);
        ArrayList fleetU1Phase2 = simulation.loadU1(phaseTwoItems);
        totalBudgetU1 = simulation.runSimulation(fleetU1Phase1)+simulation.runSimulation(fleetU1Phase2);

        ArrayList fleetU2Phase1 = simulation.loadU2(phaseOneItems);
        ArrayList fleetU2Phase2 = simulation.loadU2(phaseTwoItems);
        totalBudgetU2 = simulation.runSimulation(fleetU2Phase1)+simulation.runSimulation(fleetU2Phase2);

        System.out.println("The total Budget for fleet U1 is: "+totalBudgetU1);
        System.out.println("The total Budget for fleet U2 is: "+totalBudgetU2);

    }
}
