package com.tutorial.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {

    @Test
    void create() {
        // Get Default TimeZone
        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);

        // Set TimeZone
        TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGMT);

        // Get List timeZone Available
        String[] availableIDs = TimeZone.getAvailableIDs();
        Arrays.asList(availableIDs).forEach(timeZoneID -> System.out.println(timeZoneID));
    }

    @Test
    void date() {
        Date date = new Date();
        System.out.println(date.toString()); // get default Timezone
        System.out.println(date.toGMTString()); //set to GMT TimeZone
    }

    @Test
    void calendar() {
        Calendar calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta")); //TimeZone to WIB
        Calendar calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT")); //TimeZone to GMT

        System.out.println("HOURS : " + calendarJakarta.get(Calendar.HOUR_OF_DAY));
        System.out.println("HOURS : " + calendarGMT.get(Calendar.HOUR_OF_DAY));

        calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT")); //set TimeZone from WIB to GMT
        System.out.println("CURRENT HOURS : " + calendarJakarta.get(Calendar.HOUR_OF_DAY));

    }
}
