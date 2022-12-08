package ArraysCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo
{

    public static void main(String[] args) {


        Calendar c =Calendar.getInstance();

        SimpleDateFormat adf = new SimpleDateFormat("M/d/yyyy  hh:mm:ss");

        System.out.println(adf.format(c.getTime()));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.AM_PM));


       }
    }

