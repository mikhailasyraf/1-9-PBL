import javax.swing.JOptionPane;
public class Addition {
    public static void main (String[] args) {
        String firstNumber;
        String secondNumber;
        int num1, num2, sum;
        
        firstNumber = JOptionPane.showInputDialog("Enter first integer");
        secondNumber = JoptionPane.showInputDialog ("Enter second integer");
        
        num1 = Integer.parseInt(firstNumber);
        num2 = Integer.parseInt(secondNumber);
        sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The sum is"
 +sum, "Results",     JOptionPane.PLAIN_MESSAGE);
       System.exit(0)  ;
    }  }
