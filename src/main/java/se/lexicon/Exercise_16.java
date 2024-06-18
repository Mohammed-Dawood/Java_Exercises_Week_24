package se.lexicon;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise_16 {

    public static void exercise_16() {
        // Create a LocalDateTime object with current date and time
        LocalDateTime dateTime = LocalDateTime.now();

        // Extract LocalDate component
        LocalDate date = dateTime.toLocalDate();

        // Extract LocalTime component
        LocalTime time = dateTime.toLocalTime();

        // Print out the components
        System.out.println("Current LocalDateTime: " + dateTime);
        System.out.println("Extracted LocalDate: " + date);
        System.out.println("Extracted LocalTime: " + time);

    }
}
