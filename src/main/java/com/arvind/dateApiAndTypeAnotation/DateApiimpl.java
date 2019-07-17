package com.arvind.dateApiAndTypeAnotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateApiimpl {

    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        System.out.println("Todays date is :"+todayDate);
        LocalDate yesterdaysdate = todayDate.minusDays(1);
        System.out.println("Yesterdays date was "+yesterdaysdate);
        LocalDate tommorowDate = todayDate.plusDays(1);
        System.out.println("Tommorow date is :"+ tommorowDate);

        LocalDateTime todaysDateAndTime = LocalDateTime.now();
        System.out.println("Todays date and time is :"+todaysDateAndTime);

        LocalTime timeNow = LocalTime.now();
        System.out.println("Time now is : "+ timeNow);



    }



}
