/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifdemo;

/**
 *
 * @author mikha
 */
import java.util.Scanner;
public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter grade: ");
         int latenumber = input.nextInt();
        input.nextLine();
        int grade = 0;
        
        if (grade >=60)
            System.out.println("passed");
        // TODO code application logic here
    }
    
}
