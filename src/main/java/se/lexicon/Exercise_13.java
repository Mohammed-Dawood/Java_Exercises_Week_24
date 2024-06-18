package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise_13 {

    public static void exercise_13() {
        // Create a LocalDateTime object with current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create a DateTimeFormatter with the desired date and time formats
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'and time' HH:mm");

        // Format the current LocalDateTime using the formatter
        String formattedDateTime = currentDateTime.format(formatter);

        // Print out the formatted LocalDateTime
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);
    }
}
