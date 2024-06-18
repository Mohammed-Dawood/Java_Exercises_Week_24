package se.lexicon;

import java.time.LocalTime;
import java.util.Scanner;

public class Exercise_11 {

    public static void exercise_11() {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        int hour = -1;
        int minute = -1;
        int second = -1;

        // Prompt the user to enter hours
        while (hour < 0 || hour > 23) {
            System.out.print("Enter hours (0-23): ");
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
                if (hour < 0 || hour > 23) {
                    System.out.println("Invalid input. Please enter a valid hour.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid hour.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Prompt the user to enter minutes
        while (minute < 0 || minute > 59) {
            System.out.print("Enter minutes (0-59): ");
            if (scanner.hasNextInt()) {
                minute = scanner.nextInt();
                if (minute < 0 || minute > 59) {
                    System.out.println("Invalid input. Please enter a valid minute.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid minute.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Prompt the user to enter seconds
        while (second < 0 || second > 59) {
            System.out.print("Enter seconds (0-59): ");
            if (scanner.hasNextInt()) {
                second = scanner.nextInt();
                if (second < 0 || second > 59) {
                    System.out.println("Invalid input. Please enter a valid second.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid second.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Create a LocalTime object from the input values
        LocalTime parsedTime = LocalTime.of(hour, minute, second);

        // Print out the LocalTime object
        System.out.println("Parsed time: " + parsedTime);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
