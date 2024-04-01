package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class CountNumberOfEVENODDDigits {


    public static void main(String[] args) {


        int numbers= 1234;

        int even_count=0;
        int odd_count=0;

     while (numbers>0)
     {

         int rem = numbers%10;
         if(rem%2==0){

             even_count++;
         }else {

             odd_count++;
         }


         numbers=numbers/10;
     }


        System.out.println("even_count"+ even_count);
        System.out.println("odd_count"+ odd_count);
    }
}
