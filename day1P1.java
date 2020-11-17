
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leason Rykaart
 */
public class day1P1 {

    public static void main(String[] args) throws FileNotFoundException {
        File in = new File("Mass.txt");
        Scanner sIn = new Scanner(in);
        int reqFuelTotal = reqFuel(in, sIn); 
            System.out.println("Total Required Feul: "+ reqFuelTotal);
    }
//Method to reqFuel by having the ((mass / 3) -2) then totalled.
    public static int reqFuel(File in, Scanner sIn) throws FileNotFoundException {
       int reqFuelTotal = 0;
        while (sIn.hasNextInt()) {
            int inMass = sIn.nextInt();
            int reqFuel = ((inMass / 3) - 2);
            reqFuelTotal = reqFuelTotal + reqFuel;
                 System.out.println("Mass of " + inMass + " Requires: " + reqFuel + " of fuel.");
        }
        return reqFuelTotal;
    }
}
