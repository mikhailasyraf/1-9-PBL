/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converter;

/**
 *
 * @author mikha
 */
import java.util.Scanner;
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        //menu
        System.out.println("Converter available :");
        System.out.println("1. Currency (MYR - YEN)");
        System.out.println("2. Mass (kg - pound");
        System.out.println("3. Distance (km - m)");
        
        //input option
        System.out.print("Choose your converter : ");
        int convert = read.nextInt();
        

        //procedure
        switch(convert){
            case 1:
                        
                System.out.print("insert Amount/Quantity : RM ");
                int amount = read.nextInt();
                double money = 32.3588;
                double result = amount * money;
                System.out.println("");
                System.out.println("RM " + amount + " = " + result + " JPY ");
                break;
            
            case 2:
                
                System.out.print("insert Amount/Quantity (kg):  ");
                int amount2 = read.nextInt();
                double weight = 2.205;
                double result2 = amount2 * weight;
                System.out.println("");
                System.out.println(amount2 + " kg = " + result2 + "lbs ");
                break;
                
            case 3:
                
                System.out.print("insert Amount/Quantity (km): ");
                int amount3 = read.nextInt();
                double distance = 1000;
                double result3 = amount3 * distance;
                System.out.println("");
                System.out.println(amount3 + " km = " + result3 + "m ");
                break;
                
                
        }
    }
    
}
