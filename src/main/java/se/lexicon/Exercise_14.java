package se.lexicon;

import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise_14 {

    public static void exercise_14() {
        // Create a LocalDateTime object with current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create a DateTimeFormatter with the desired pattern and locale
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", new Locale("sv", "SE"));

        // Format the current LocalDateTime using the formatter
        String formattedDateTime = currentDateTime.format(formatter);

        // Print out the formatted LocalDateTime
        System.out.println("Formatted LocalDateTime (Swedish): " + formattedDateTime);
    }
}
