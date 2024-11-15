/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapedemo;

/**
 *
 * @author mikha
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 15; 
        int cols = 46; 
        int starRows = 9; 
        int starCollums = 12; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                if (i < starRows && j < starCollums) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        System.out.print("*");
                    } else if (i % 2 == 1 && j % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                
                else {
                    System.out.print("=");
                }
            }
            System.out.println(); 
        }
    }
}
        
