package ArraysCode;

import java.util.Scanner;

public class Code2{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter num to sum ?");
        int x = num.nextInt();
        int a[] = new int[x];
        int sum=0;
//        a[0]=1;
//        a[1]=3;
//        a[2]=5;
//        a[3]=9;
//        a[4]=8;
        for (int i = 0; i < a.length; i++) {
            a[i]=num1.nextInt();
            sum+=a[i];
        }
        System.out.println("Total number are :"+sum);


//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter username");
//        String name = scanner.nextLine();
//        System.out.println("Enter Age ");
//        int age = scanner.nextInt();
//
//        System.out.println("result "+ name);
//        System.out.println("result "+ age);

    }
}
