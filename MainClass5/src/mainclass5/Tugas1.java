/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainclass5;

/**
 *
 * @author mikha
 */
import java.util.Scanner;

public class Tugas1 {

    public void displaymiso() {
        Scanner fish = new Scanner(System.in);
        char choice;

        do {

            
            System.out.println("Enter the first integer: ");
            int num1 = fish.nextInt();

            System.out.println("Enter the second integer: ");
            int num2 = fish.nextInt();

            System.out.println("Enter the third integer: ");
            int num3 = fish.nextInt();

           
            int maxValue = Math.max(num1, Math.max(num2, num3));
            int minValue = Math.min(num1, Math.min(num2, num3));

           
            System.out.println("Maximum value: " + maxValue);
            System.out.println("Minimum value: " + minValue);

            
            System.out.println("Do you want to use another set of numbers? (y/n): ");
            choice = fish.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Semoga diampuni di akhirat kelak.");
    }
}

    