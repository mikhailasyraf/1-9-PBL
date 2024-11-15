import java.util.Scanner;

public class CafeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double runningTotal = 0.0;
        String[] items = {"Miso Soup", "Matcha", "Latte"};
        double[] prices = {7.00, 5.50, 5.00};

        System.out.println("Welcome to Miso Soup");
        System.out.println("------------------------");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %s ($%.2f)\n", i + 1, items[i], prices[i]);
        }
        System.out.println(items.length + 1 + ". Done");

        while (true) {
            System.out.print("Enter your choice (1-" + (items.length + 1) + "): ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > items.length + 1) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }
            if (choice == items.length + 1) {
                break; // User is done ordering
            }
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            if (quantity <= 0) {
                System.out.println("Invalid quantity. Please enter a positive value.");
                continue;
            }
            double subtotal = prices[choice - 1] * quantity;
            System.out.printf("Subtotal for %s (x%d): $%.2f\n", items[choice - 1], quantity, subtotal);
            runningTotal += subtotal;
        }

        System.out.printf("Total price: $%.2f\n", runningTotal);
        System.out.println("Enjoy your meal!");
        scanner.close();
    }
}
