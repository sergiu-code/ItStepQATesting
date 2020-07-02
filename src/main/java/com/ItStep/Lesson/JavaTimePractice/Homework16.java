package com.ItStep.Lesson.JavaTimePractice;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;


public class Homework16 {
    public static void main(String[] args) {
//method to get the last LocalDate of the month from a LocalDateTime
        Month month = LocalDateTime.now().toLocalDate().getMonth();
        System.out.println(month);
        System.out.println();
//method to get the last day of the current month
        Calendar calendar = Calendar.getInstance();
        int lastDayOfCurrentMonth = calendar.getActualMaximum(Calendar.DATE);
        System.out.println("Last date of the current month = " + lastDayOfCurrentMonth);
        System.out.println();
//method to get difference of days between 2 dates
        LocalDate startDate = LocalDate.of(2020, Month.JUNE, 12);
        LocalDate endDate = LocalDate.of(2020, Month.DECEMBER, 12);
        int DaysBetween = (int) ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println(DaysBetween + " days between");
        System.out.println();
//method to get the seconds between two LocalTime’s
        ZoneId zone1 = ZoneId.of("Europe/Chisinau");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime local1 = LocalTime.now(zone1);
        System.out.println("Moldova time zone: " + local1);
        LocalTime local2 = LocalTime.now(zone2);
        System.out.println("Japan time zone: " + local2);
        long seconds = ChronoUnit.SECONDS.between(local1, local2);
        System.out.println("Seconds between these two LocalTime's: " + seconds);
        System.out.println();
//  method to get the LocalDate of Monday from current date
        LocalDate currentDay = LocalDate.now();
        LocalDate yesterday = currentDay.minusDays(5);
        System.out.println("today's date: " + currentDay);
        System.out.println("monday's date was: " + yesterday);
        System.out.println();
//        2nd example
        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("E-dd-LLLL-yyyy");
        System.out.println("Today's date is: " + dateFormat.format(cal.getTime()));
        cal.add(Calendar.DATE, -5);
        System.out.println("Monday's date was: " + dateFormat.format(cal.getTime()));
        System.out.println();
//method that will print the LocalDateTime like: 2020/Jan/01 2PM:02:59
        DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("yyyy/LLL/dd ha:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2020/Jan/01 2PM:02:59", dateFormat1);
        System.out.println(dateFormat1.format(dateTime));


    }


}


