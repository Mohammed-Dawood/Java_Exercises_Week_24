package se.lexicon;

import java.time.LocalTime;

public class Exercise_10 {

    public static void exercise_10() {
        // Create a LocalTime object of the current time
        LocalTime currentTime = LocalTime.now();

        // Extract the nanoseconds from the current time
        int nanoseconds = currentTime.getNano();

        // Print out the nanoseconds
        System.out.println("Current time: " + currentTime);
        System.out.println("Nanoseconds: " + nanoseconds);
    }
}
