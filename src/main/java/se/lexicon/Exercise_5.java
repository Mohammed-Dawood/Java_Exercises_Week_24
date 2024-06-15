package se.lexicon;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Exercise_5 {
    public static void exercise_5() {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday = null;

        // Ask the user to enter the year (must be four digits)
        int year = 0;
        while (true) {
            System.out.print("Enter the year of your birthday (four digits): ");
            String yearInput = scanner.nextLine();

            // Check if input is exactly four digits
            if (yearInput.length() == 4 && yearInput.matches("\\d{4}")) {
                year = Integer.parseInt(yearInput);
                break; // Exit loop if valid input
            } else {
                System.out.println("Invalid input. Year must be exactly four digits.");
            }
        }

        // Ask the user to enter the month
        System.out.print("Enter the month of your birthday (1-12): ");
        int month = scanner.nextInt();

        // Ask the user to enter the day
        System.out.print("Enter the day of your birthday: ");
        int day = scanner.nextInt();

        try {
            // Construct a LocalDate object from year, month, and day
            birthday = LocalDate.of(year, month, day);

            // Extract the day of the week for that date
            DayOfWeek dayOfWeek = birthday.getDayOfWeek();

            // Print out the day of the week
            System.out.println("Your birthday on " + birthday + " was on a " + dayOfWeek);
        } catch (Exception e) {
            // Handle invalid input or date creation exception
            System.out.println("Invalid date. Please enter a valid year, month, and day.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
