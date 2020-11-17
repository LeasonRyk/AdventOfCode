
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
public class day1P2 {

    public static void main(String[] args) throws FileNotFoundException {
        File in = new File("Mass.txt");
        Scanner sIn = new Scanner(in);
        int reqFuelonFuelTotal = reqFuel(in, sIn);
        System.out.println("Total Required Feul: " + reqFuelonFuelTotal);
    }
//Method to reqFuelonFuel by having the ((reqFuel / 3) -2) then totalled to give us the fuel on fuel total.

    public static int reqFuel(File in, Scanner sIn) throws FileNotFoundException {
        int reqFuelonFuelTotal = 0;
        
        while (sIn.hasNextInt()) {
            int inMass = sIn.nextInt();
            int reqFuel = ((inMass / 3) - 2);
            int reqFuelonFuel = reqFuel;
            int counter = reqFuel;
            
                while (counter >= 2) { 
                    counter = (counter / 3);
                
                        if (counter > 2) {                  //Checks to see if no. > 2 
                        counter = counter - 2;
                        }
                
                     System.out.print(counter + " + ");
                     reqFuelonFuel = reqFuelonFuel + counter;
                }
            
            System.out.print(" === " + reqFuelonFuel);
            System.out.println("");
            reqFuelonFuelTotal = reqFuelonFuelTotal + reqFuelonFuel;
        }
        return reqFuelonFuelTotal;
    }
}
