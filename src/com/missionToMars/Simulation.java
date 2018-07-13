package com.missionToMars;
/**
 * This class is responsible and fill up the rockets
 * @author Misael Mondragon
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    /**
     * Reads items from text file and returns them in an array list Items
     * @param phase name of the file corresponding to the phase to be evaluated
     * @return an array list of elements called Items
     * @throws FileNotFoundException
     */
    public ArrayList<Item> loadItems(String phase) throws FileNotFoundException {
        File file = new File(phase);
        Scanner scanner = new Scanner(file);
        ArrayList<Item> listaItems = new ArrayList<Item>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] line2 = line.split("=");
            //create an Item
            Item item = new Item();
            item.setName(line2[0]);
            item.setWeight(Integer.parseInt(line2[1]));
            // add the item to the list
            listaItems.add(item);
        }
        return listaItems;
    }

    /**
     * Takes the array list of items and fills as many rockets necessary
     * to carry them
     * @param itemArrayList the list of loaded items
     * @return an array list of the U1 rockets that have been used.
     */
    public ArrayList<Rocket> loadU1(ArrayList<Item> itemArrayList){
        Rocket rocket1 = new U1();
        ArrayList<Rocket> listaU1 = new ArrayList<Rocket>();
        listaU1.add(rocket1);
        for (Item item: itemArrayList) {
            if (rocket1.canCarry(item)){
                rocket1.carry(item);
            }else{
                rocket1=new U1();
                listaU1.add(rocket1);
                rocket1.carry(item);
            }

        }
        //System.out.println("cantidad cohetes U1: "+listaU1.size());
        //System.out.println("cantidad items: "+itemArrayList.size());
        return listaU1;

    }

    /**
     * Takes the array list of items and fills as many rockets necessary
     * to carry them
     * @param itemArrayList the list of loaded items
     * @return an array list of the U2 rockets that have been used.
     */
    public ArrayList<Rocket> loadU2(ArrayList<Item> itemArrayList){
        Rocket rocket2 = new U2();
        ArrayList<Rocket> listaU2 = new ArrayList<Rocket>();
        listaU2.add(rocket2);
        for (Item item: itemArrayList) {
            if (rocket2.canCarry(item)){
                rocket2.carry(item);
            }else{
                rocket2=new U2();
                listaU2.add(rocket2);
                rocket2.carry(item);

            }

        }
        //System.out.println("cantidad cohetes U2: "+listaU2.size());
        //System.out.println("cantidad items: "+itemArrayList.size());

        return listaU2;
    }

    public long runSimulation(ArrayList<Rocket> rocketList){

        int a=rocketList.size();
        long budget=0;
        for(int i=0; i<a;i++){
            if(rocketList.get(i).launch()&&rocketList.get(i).land()){
                budget=budget+rocketList.get(i).cost;
                System.out.println("Cohete exitoso! "+rocketList.get(i).cost);
            }else{
                budget=budget+rocketList.get(i).cost;
                System.out.println("Cohete Explotó!"+rocketList.get(i).cost);
                i=i-1;
            }
        }


        return budget;
    }

}
