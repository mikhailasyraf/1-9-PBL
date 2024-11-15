import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        
        int N1, N2, Addition, Subtraction, Multiplication, Division, AO;
    
        Scanner tuka = new Scanner(System.in);
         
        System.out.print("Enter Integer 1: ");
        N1 = tuka.nextInt();
        
        System.out.print("Enter Integer 2: ");
        N2 = tuka.nextInt();
        
        tuka.nextLine(); 
        
        System.out.println("Choose Your Arithmetic Operator" );
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
    
        AO = tuka.nextInt();
        
        //Calculation
        Addition = N1 + N2;// addition calculation
        Subtraction = N1 - N2;//subtraction calculation
        Multiplication = N1 * N2;//multipication subtraction
        Division = (N1/N2); //division subtraction
     
        switch (AO){//switch case to choose which operator can the user choose
            case 1: 
                System.out.println("Addition: " + Addition); 
                break;//addition operator
            case 2: 
                System.out.println("Subtraction: " + Subtraction); 
                break;//subtraction operator
            case 3: 
                System.out.println("Multiplication: " + Multiplication); 
                break;//multipication operation
            case 4: 
                System.out.println("Division: " + Division); 
                break;//devision op
            
        }
        }
    }