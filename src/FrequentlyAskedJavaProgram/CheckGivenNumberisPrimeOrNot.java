package FrequentlyAskedJavaProgram;

public class CheckGivenNumberisPrimeOrNot {

    public static void main(String[] args) {


        // natural number
        // has only factors 1 and itselfs
        int num = 15;
        int count = 0;

        if (num > 1)
        {
            for (int i = 1; i <= num; i++) //1 2 3
            {
                if (num % i == 0)
                    count++;
            }



            //checking prime or not
            if (count == 2) {
                System.out.println("number is prime ");
            } else {
                System.out.println("number is not prime ");
            }


            //checking > 1
        } else {
            System.out.println("Not Prime");
        }



    }
}