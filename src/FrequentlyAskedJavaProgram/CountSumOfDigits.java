package FrequentlyAskedJavaProgram;

public class CountSumOfDigits {
    public static void main(String[] args) {

        int num=25;

        int sum=0;

        while (num>0)   // 1234    //123  //12   //1
        {
            sum=sum+num%10;    //,4   +  //,3  + //,2   + //,1
             num=num/10;  //123  //12  //1  //1
        }

        System.out.println("sum :"+ sum);

    }
}
