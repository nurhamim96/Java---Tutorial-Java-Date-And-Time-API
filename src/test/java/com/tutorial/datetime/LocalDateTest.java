package com.tutorial.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void create() {
        LocalDate localDate1 = LocalDate.now(); // Date Now
        LocalDate localDate2 = LocalDate.of(1996, Month.MAY, 15); // set Date
        LocalDate localDate3 = LocalDate.parse("1996-05-15"); // Convert from String to Date

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

    }

    @Test
    void with() {
        LocalDate localDate1 = LocalDate.now(); // Immutable
        LocalDate localDate2 = localDate1.withYear(1996); // set Years
        LocalDate localDate3 = localDate1.withYear(1996).withMonth(1); // set Years and Month

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void modify() {
        LocalDate localDate1 = LocalDate.now(); // Date Now
        LocalDate localDate2 = localDate1.plusYears(10); // Plus Years 10
        LocalDate localDate3 = localDate1.minusMonths(10); // Minus month 10

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void get() {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
    }
}
