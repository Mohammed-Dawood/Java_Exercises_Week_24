package se.lexicon;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;


public class Exercise_7 {

    public static void exercise_7() {
        Scanner scanner = new Scanner(System.in);

        // Get the birthdate from the user
        LocalDate birthdate = getBirthdate(scanner);

        // Retrieve the LocalDate from Exercise 6
        LocalDate adjustedDate = getAdjustedDate();

        // Create a Period between the birthdate and the adjusted date
        Period period = Period.between(birthdate, adjustedDate);

        // Print out the elapsed years, months, and days
        System.out.println("Elapsed time from birthdate to adjusted date: " +
                period.getYears() + " years, " +
                period.getMonths() + " months, and " +
                period.getDays() + " days.");

        // Close the scanner
        scanner.close();
    }

    private static LocalDate getBirthdate(Scanner scanner) {
        int year = 0, month = 0, day = 0;

        // Get the year
        while (true) {
            System.out.print("Enter the year of your birthday (four digits): ");
            String yearInput = scanner.nextLine();
            if (yearInput.length() == 4 && yearInput.matches("\\d{4}")) {
                year = Integer.parseInt(yearInput);
                break;
            } else {
                System.out.println("Invalid input. Year must be exactly four digits.");
            }
        }

        // Get the month
        while (true) {
            System.out.print("Enter the month of your birthday (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    break;
                } else {
                    System.out.println("Invalid input. Month must be between 1 and 12.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid month.");
                scanner.next(); // Clear invalid input
            }
        }

        // Get the day
        while (true) {
            System.out.print("Enter the day of your birthday: ");
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                if (day >= 1 && day <= 31) { // Simplified validation; can be improved
                    break;
                } else {
                    System.out.println("Invalid input. Day must be between 1 and 31.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid day.");
                scanner.next(); // Clear invalid input
            }
        }

        // Clear the buffer
        scanner.nextLine();

        return LocalDate.of(year, month, day);
    }

    private static LocalDate getAdjustedDate() {
        // Create a LocalDate object of the current date
        LocalDate currentDate = LocalDate.now();

        // Add 10 years to the current date
        LocalDate futureDate = currentDate.plusYears(10);

        // Subtract 10 months from the new date
        return futureDate.minusMonths(10);
    }
}
