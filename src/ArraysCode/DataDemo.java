package ArraysCode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DataDemo {


    public static void main(String[] args) {


        Date d = new Date();
        SimpleDateFormat adf = new SimpleDateFormat("M/d/yyyy");

        System.out.println(adf.format(d));
        System.out.println(d.toString());

    }
}
