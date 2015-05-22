package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static int limitHour = 23;
    public static int limitMinute = 0;
    public static int limitSecond = 0;


    public static void setTime(int hour, int minute, int second) {
        limitHour = hour;
        limitMinute = minute;
        limitSecond = second;
    }

    public static boolean TimesUp() {
        LocalDateTime rightNow = LocalDateTime.now();

        LocalTime limitTime = LocalTime.of(limitHour, limitMinute, limitSecond);
        LocalDateTime limitDateTime = LocalDateTime.of(LocalDate.now(), limitTime);

        int hour = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();
        int second = LocalDateTime.now().getSecond();

        System.out.println("Now Hr = " + hour);
        System.out.println("Now Min = " + minute);
        System.out.println("Now sec = " + second);
        System.out.println("=====================");

        if(rightNow.compareTo(limitDateTime) >= 0) {
            System.out.println("Time Pass");
            System.out.println("***************************");
            return true;
        }

        return false;
    }


}
