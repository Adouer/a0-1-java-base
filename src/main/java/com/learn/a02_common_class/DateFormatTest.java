package com.learn.a02_common_class;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:dd:ss");
        String s = dateFormat.format(new Date());
        System.out.println(s);

        String s1 = "2023-02-31 16:31:33";
        Date date = dateFormat.parse(s1);
        System.out.println(date);
    }
}
