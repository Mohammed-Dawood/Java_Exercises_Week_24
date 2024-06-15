Java Time API Exercises:

Exercise 1:
Create a LocalDate of the current day and print it out

Exercise2:
Create a LocalDate of the current day and print it out in the following pattern using DateTimeFormatter: Torsdag 29 mars.

Exercise3:
Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
format.

Exercise 4:
Create a LocalDate object from a String by using the .parse() method.

Exercise5
The date time api provides enums for time units such as day and month. Create a LocalDate of your birthday and extract the day of week for that date. Ex. 1945-05-08 -> TUESDAY

Exercise6
Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.

Exercise7
Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date from exercise 5. Print out the elapsed years, months and days.

Exercise 8
Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add the period you created to the current date.

Exercise 9
Create a LocalTime object of the current time.

Exercise 10
Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.

Exercise 11
Create a LocalTime object from a String using the .parse() method.

Exercise 12
Using DateTimeFormatter format LocalTime from current time and print it out as following pattern: 10:32:53

Exercise 13
Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00

Exercise 14
Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String that should look like this: torsdag 5 april 10:00

Exercise 15
Create a LocalDateTime object by combining LocalDate object and LocalTime object.

Exercise 16
Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate objects of respective types from the LocalDateTime object.

Extra challange
Create your own calendar for the year 2018.
