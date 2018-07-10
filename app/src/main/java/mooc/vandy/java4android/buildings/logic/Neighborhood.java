package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    /**
     * Prints the total summary of building objects
     *
     * @param buildings array of building objects
     * @param header    name of the class printed
     * @param out       output interface
     */
    public static void print(Building[] buildings, String header, OutputInterface out) {

        out.println(header + "\n--------\n");

        for (int i = 0; i < buildings.length; i++) {

            out.println(buildings[i].toString()); //prints all the elements
        }

    }

    /**
     * calculates the total area of all the buildings in the array
     *
     * @param buildings array of building objects
     * @return total area of all the buildings in the array
     */
    public static int calcArea(Building[] buildings) {

        int totalArea = 0;  // variable for total area

        for (int i = 0; i < buildings.length; i++) {

            totalArea += buildings[i].calcLotArea(); //adds all the calculated areas
        }
        return totalArea; //returns total area

    }


}
