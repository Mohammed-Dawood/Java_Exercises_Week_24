package se.lexicon;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise_12
{

    public static void exercise_12() {
        // Create a LocalTime object of the current time
        LocalTime currentTime = LocalTime.now();

        // Create a DateTimeFormatter with the desired pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format the current time using the formatter
        String formattedTime = currentTime.format(formatter);

        // Print out the formatted time
        System.out.println("Formatted time: " + formattedTime);
    }
}

