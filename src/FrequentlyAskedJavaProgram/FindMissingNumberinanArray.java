package FrequentlyAskedJavaProgram;

public class FindMissingNumberinanArray {

    public static void main(String[] args) {

        // Array should not have duplicated
        // Array no need to be sorted order
        // values should be in a range
        int a []={1 , 2, 3, 4};


        // 1+2+4+5 =12 sum1
        //1+2+3+4+5= 15 sum2
        // sum2 - sum1 = 15-12=3 missing

        int sum=0;
        for (int i = 0; i <a.length ; i++)
        {
          sum=sum+a[i];
        }
        System.out.println("sum of elements of array  :"+sum);



        int sum2=0;
        for (int i = 1; i <=4 ; i++) {

            sum2=sum2+i;
        }

        System.out.println("sum of elements of range  :"+sum2);




        System.out.println("Missing number   :"+ (sum2 - sum));



    }
}
