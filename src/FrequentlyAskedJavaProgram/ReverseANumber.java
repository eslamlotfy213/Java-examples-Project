package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        //1. using alogorithm
               int rev=0;
               while (num!=0)
               {
                   rev=rev*10 +num%10;
                   num = num/10;
               }
        System.out.println("Reverse number is : "+ rev);


        //2. using StringBuffer
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev2 = sb.reverse();
        System.out.println("Reverse Number is : "+ rev2);





    }
}
