package se.lexicon;

import java.time.LocalDate;
import java.time.Period;

public class Exercise_8 {

    public static void exercise_8() {
        // Create a Period of 4 years, 7 months, and 29 days
        Period period = Period.of(4, 7, 29);

        // Create a LocalDate of the current date
        LocalDate currentDate = LocalDate.now();


        // Add the period to the current date
        LocalDate newDate = currentDate.plus(period);

        // Print out the new date
        System.out.println("Current date: " + currentDate);
        System.out.println("New date after adding the period: " + newDate);
    }
}
