package se.lexicon;

import java.time.Month;
import java.time.LocalDate;

public class Exercise_6 {

    public static void exercise_6() {
        // Create a LocalDate object of the current date
        LocalDate currentDate = LocalDate.now();

        // Add 10 years to the current date
        LocalDate futureDate = currentDate.plusYears(10);

        // Subtract 10 months from the new date
        LocalDate adjustedDate = futureDate.minusMonths(10);

        // Extract the month from the adjusted date
        Month month = adjustedDate.getMonth();

        // Print out the month
        System.out.println("The month of the adjusted date is: " + month);
    }
}
