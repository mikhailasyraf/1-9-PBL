/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purchasingsystem;

import java.util.Scanner;

/**
 *
 * @author mikha
 */
public class PurchasingSystem{
    public static void main(String[] args) {
        String itemName = "",confirmation;        
        int quantity,productChoice;            
        float ItemPrice = 0,totalCost = 0;                   

        Scanner what = new Scanner(System.in);
        
        System.out.println("***********************************************");   
        System.out.println("               Welcome to Misoffee             ");    
        System.out.println("_______________________________________________");
        System.out.println("===== Today's Special: Soph's Fav Combos! =====");
        System.out.println("_");
        System.out.println("1. Miso Soup & Hot Tea               - RM  9.90");
        System.out.println("2. Beef Lasagna & Iced Latte         - RM 27.50");
        System.out.println("3. Aglio Olio Pasta & Ice Lemon Tea  - RM 24.90");
        System.out.println("4. Baked Cookies & Matcha Latte      - RM 14.90");
        System.out.println("_______________________________________________");

        System.out.print("\n           Choose Your Craved Item:           ");
        productChoice = what.nextInt();

        System.out.print("Enter the quantity: ");
        quantity = what.nextInt();

        switch (productChoice) {
            case 1:
                itemName = "Miso Soup & Hot Tea";    
                ItemPrice = 9.90f;break;  
            case 2:
                itemName = "Beef Lasagna & Iced Latte";       
                ItemPrice = 27.50f;break;  
            case 3:
                itemName = "Aglio Olio Pasta & Ice Lemon Tea";   
                ItemPrice = 24.90f;break; 
            case 4:
                itemName = "Baked Cookies & Matcha Latte";   
                ItemPrice = 14.90f;break;             
            default:
                System.out.println("Enter number 1-4");break;
        }

        totalCost = ItemPrice * quantity; 

        System.out.println("\nOrder Summary:");
        System.out.println("Product: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price per item: RM%.2f\n", ItemPrice); 
        System.out.printf("Total cost: RM%.2f\n", totalCost); 

        System.out.print("\nDo you want to proceed with the purchase? (yes/no): ");
        confirmation = what.next();
        what.close();

        if(confirmation.equalsIgnoreCase("yes"))
            System.out.println("Thank you for your purchase!");        
        else
            System.out.println("Order has been cancelled.");
    }
}
