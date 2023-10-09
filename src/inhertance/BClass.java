package inhertance;

import java.util.Scanner;

public class BClass extends  AClass{


    int i =  20;


    public static void main(String[] args)
    {
        AClass b = new BClass();
        System.out.println(b.i);

//
//        Scanner scan = new Scanner(System.in);
//
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//
//        scan.close();
    }

}
