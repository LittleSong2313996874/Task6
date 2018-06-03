package com.ss.util.others;


import java.text.SimpleDateFormat;
import java.util.Date;

public class testConvert {

    //@Test
    public static String dateUtil(long ms) {
        //Date date;
        SimpleDateFormat spfmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       return spfmt.format(ms);

    }
}
