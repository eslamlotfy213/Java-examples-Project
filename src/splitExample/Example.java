package splitExample;

import java.util.Collection;
import java.util.Collections;

public class Example {


    public static void main(String[] args) {



        String str = "Rahul Shetty Academy";
        //using split


        String [] splittedString = str.split("Shetty");
        System.out.println(splittedString[0].trim());
        System.out.println(splittedString[1].trim());



        for (int i = 0; i < str.length(); i++)
        {

            System.out.println(str.charAt(i));
        }



    }
}
