package FrequentlyAskedJavaProgram;

public class FibonacciSeriesofNumbersinJava {


    public static void main(String[] args) {

        int n1=0;
        int n2=1;
        int sum=0;



              // 0 1         1  2 3 5 8 13 21  34
     // index // 0 1        #2# 3 4 5 6  7  8  9


        System.out.print(n1+" "+n2);  // 0  1

                  //#2#
        for (int i = 2; i < 10; i++)
        {
            sum= n1+n2; //0 + 1 = 1
            System.out.print("  "+sum); //1
            n1=n2;
            n2=sum;

        }





//        int n=10, firstNum=0, secondNum =1;
//        int nextNum;
//
//        for (int i = 0; i <= n; i++)
//        {
//            System.out.print(firstNum+ " ," );
//            nextNum = firstNum +secondNum;
//            firstNum = secondNum;
//            secondNum = nextNum;
//        }
//


    }












}
