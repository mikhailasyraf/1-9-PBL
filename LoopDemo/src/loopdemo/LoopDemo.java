/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopdemo;

/**
 *
 * @author mikha
 */
public class LoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //  for loop
        System.out.println("Using for loop:");
        for (int p = 1; p <= 10; p++) {
            System.out.print(p + " ");
        }
        System.out.println(); 

        //  while loop
        System.out.println("Using while loop:");
        int m = 1;
        while (m <= 10) {
            System.out.print(m + " ");
            m++;
        }
        System.out.println();
        
        // do-while loop
        System.out.println("Using do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
        System.out.println();
    }
    }
