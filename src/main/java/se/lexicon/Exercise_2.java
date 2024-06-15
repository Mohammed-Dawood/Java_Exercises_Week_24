package se.lexicon;

import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise_2 {
    public static void exercise_2() {
        // Create a LocalDate object of the current day
        LocalDate currentDate = LocalDate.now();

        // Create a DateTimeFormatter with the desired pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM", new Locale("en", "US"));

        // Format the current date using the formatter
        String formattedDate = currentDate.format(formatter);

        // Print out the formatted current date
        System.out.println("Current date: " + formattedDate);
    }
}
