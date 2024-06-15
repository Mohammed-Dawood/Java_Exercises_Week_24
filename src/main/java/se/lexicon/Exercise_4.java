package se.lexicon;

import java.time.LocalDate;

public class Exercise_4 {
    public static void exercise_4() {

        // Example date string
        String dateString = "2024-06-15";

        // Parse the string to a LocalDate object
        LocalDate date = LocalDate.parse(dateString);

        // Print out the LocalDate object
        System.out.println("Parsed date: " + date);

    }
}
