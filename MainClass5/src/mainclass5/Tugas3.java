/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass5;

/**
 *
 * @author mikha
 */
import java.util.Scanner;

public class Tugas3 {

    // Method to determine the grade based on the mark
    public static char getGrade(int mark) {
        if (mark >= 90) {
            return 'A';
        } else if (mark >= 80) {
            return 'B';
        } else if (mark >= 70) {
            return 'C';
        } else if (mark >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Method to count and display the number of each grade
    public static void countAndDisplayGrades(int[] marks) {
        int[] gradeCounts = new int[5]; // To store counts for grades A, B, C, D, E

        // Count the number of each grade
        for (int mark : marks) {
            char grade = getGrade(mark);
            switch (grade) {
                case 'A': gradeCounts[0]++; break;
                case 'B': gradeCounts[1]++; break;
                case 'C': gradeCounts[2]++; break;
                case 'D': gradeCounts[3]++; break;
                case 'E': gradeCounts[4]++; break;
            }
        }

        // Display the results
        System.out.println("Out of 10:");
        System.out.println("Grade A: " + gradeCounts[0]);
        System.out.println("Grade B: " + gradeCounts[1]);
        System.out.println("Grade C: " + gradeCounts[2]);
        System.out.println("Grade D: " + gradeCounts[3]);
        System.out.println("Grade E: " + gradeCounts[4]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];

        // Get 10 marks from the user
        System.out.println("Enter 10 marks:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Count and display the grades
        countAndDisplayGrades(marks);
    }
}
