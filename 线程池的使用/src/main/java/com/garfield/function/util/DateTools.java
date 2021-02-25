package com.garfield.function.util;


import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by guoyu.mao on 2019/5/28.
 * Email:maoguoyu@ewell.cc
 */
public class DateTools {


   public static int getWeek(LocalDate date) {
       DayOfWeek dayOfWeek = date.getDayOfWeek();
       int day = dayOfWeek.getValue();
       if (day == 7) {
           return 0;
       }
       return day;
   }

   @Test
    public void test() {
        LocalDate localDate = LocalDate.now();
       localDate = localDate.plusDays(6L);
        System.out.println(getWeek(localDate));

    }
}
