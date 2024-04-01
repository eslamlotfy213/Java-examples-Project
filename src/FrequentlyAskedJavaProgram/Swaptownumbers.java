package FrequentlyAskedJavaProgram;

public class Swaptownumbers {


    public static void main(String[] args)
    {
        int a=10;
        int b =20;

        //logic 1 third value
        System.out.println("befor "+a+"  "+b );
        int t=a;
            a=b;
            b=t;
        System.out.println("After "+a+"  "+b );


        //logic 2
        a=a+b;  //10 + 20 = 30
        b=a-b;   //30 - 21 = 10
        a=a-b;   //30 - 10 = 20
        System.out.println("After "+a+"  "+b );

         //logic 3  a and b should not zero
          a=a*b;   //10*20=200
          b=a/b;   //200/20=10
          a=a/b;   //200/10=20
        System.out.println("After "+a+"  "+b );

        //logic 4 bitwise XOR(^)



        //logic 5 single line
         // b = (a+b) - (a=b)



    }
}
