package se.lexicon;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise_15 {

    public static void exercise_15() {
        // Create a LocalDate object
        LocalDate date = LocalDate.of(2023, 9, 15); // Example date: September 15, 2023

        // Create a LocalTime object
        LocalTime time = LocalTime.of(14, 30); // Example time: 14:30 (2:30 PM)

        // Create a LocalDateTime object by combining LocalDate and LocalTime
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        // Print out the LocalDateTime object
        System.out.println("Combined LocalDateTime: " + dateTime);
    }
}
