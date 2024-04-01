package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class FindLargestOf3Numbers {

    public static void main(String[] args) {

        //a > b & a > c -> a largest
        //b > a & b > c -> b largest
       // c > a & c >b  -> c largest

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbers: ");
        int a = sc.nextInt();


        System.out.println("Enter 2nd numbers: ");
        int b = sc.nextInt();

        System.out.println("Enter 3th numbers: ");
        int c = sc.nextInt();


        if (a>b & a>c){
            System.out.println("a is the largest");
        }else  if (b>a & b>c){
            System.out.println("b is the largest");
        }else  if (c>a & c>c){
            System.out.println("c is the largest");
        }else {
            System.out.println("no data ");
        }


    }
}
