package mateusz.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Time {

    public static void main(String[] args) {
        System.out.println("Today: " + LocalDate.now());
        System.out.println("Current time: " + LocalTime.now());
        System.out.println("Current time and date: " + LocalDateTime.now());

        LocalDate date = LocalDate.now();

        printDate(date);
        printDate(LocalDate.now());

        System.out.println("Current date minus one day");
        printDate(date.minusDays(1));

        System.out.println("Nothing changed in date object");
        printDate(date);

        System.out.println("Printing time!");
        printTime(LocalTime.now());

        printTime(LocalTime.now().minusMinutes(5));

        printTime(LocalTime.of(15,15,15));

        LocalDate birthDate = LocalDate.of(1991, 12, 12);
        LocalDate currentDate = LocalDate.now();

        Period lifetime = Period.between(birthDate, currentDate);

        LocalDate startOfThisCourse = LocalDate.of(2019, 3, 10);
    }

    private static void printDate(LocalDate localDate) {
        System.out.println("Day: " + localDate.getDayOfMonth());
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Year: " + localDate.getYear());
    }

    private static void printTime(LocalTime localTime) {
        System.out.println("Hour: " + localTime.getHour());
        System.out.println("Minute: " + localTime.getMinute());
        System.out.println("Second: " + localTime.getSecond());
    }
}
