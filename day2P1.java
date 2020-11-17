
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
public class day2P1 {

    public static void main(String[] args) throws FileNotFoundException {

        File in = new File("inputDay2.txt");
        Scanner sIn = new Scanner(in);
        String key = sIn.nextLine();
        String[] keys = key.split(",");
        int arr[] = new int[keys.length];
        for (int j = 0; j < keys.length; j++) {
            String Value = keys[j];
            System.out.println("index: " + j + " = " + Value);
            arr[j] = Integer.parseInt(Value);
        }
int counter = 0;
        for (int i = 0; i < arr.length; i+=4) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+",");
}
            System.out.println("");
            int opcode = arr[i];
            System.out.println("opCode: " + opcode);
            int no1 = arr[i + 1];
            System.out.println("no1: " + no1);
            int no2 = arr[i + 2];
            System.out.println("no2: " + no2);
            int location = arr[i + 3];
            System.out.println("location: " + (location+1));
        int opcheck  = opcodeCheck(opcode, no1, no2) ;
        if (opcheck == 99){
            break;
        }else{
            arr[location] = opcheck;
        }
        
            counter++;
        }
        System.out.println("Number of times: "+counter);
    }
    public static int opcodeCheck(int opcode, int var1, int var2) {
        int ans = 0;
        switch (opcode) {
            case 1:
                ans = var1 + var2;
                break;
            case 2:
                ans = var1 * var2;
                break;
            case 99:
                ans = 99;
                break;
            default:
                System.out.println("Invaild opCode!");
        }

        return ans;

    }

}
