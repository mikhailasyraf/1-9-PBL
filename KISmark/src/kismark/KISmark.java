/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kismark;

/**
 *
 * @author mikha
 */
import java.util.Scanner;
public class KISmark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//
        
        System.out.print("insert late number: ");
        int latenumber = input.nextInt();
        input.nextLine();
        float deductmarks = (float) 0.3;
        float totalKISmark = 0;
        float balance;
        if (latenumber >3)
        {
            totalKISmark = latenumber * deductmarks;
            balance = 10 - totalKISmark;
            System.out.println("Total KIS Mark:"+ totalKISmark);
            System.out.println("Balance KIS mark:"+ balance);
        }
        // TODO code application logic here
    }
    
}