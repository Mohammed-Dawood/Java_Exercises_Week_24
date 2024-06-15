package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise_3 {
    public static void exercise_3() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the most recent Monday
        LocalDate lastMonday = currentDate.with(DayOfWeek.MONDAY);

        // Create a DateTimeFormatter with the ISO_LOCAL_DATE pattern
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        // Print out the entire week starting from last Monday
        for (int i = 0; i < 7; i++) {
            LocalDate day = lastMonday.plusDays(i);
            System.out.println(day.format(formatter));
        }
    }
}
