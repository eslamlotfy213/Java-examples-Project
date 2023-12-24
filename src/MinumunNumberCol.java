public class MinumunNumberCol
{

    public static void main(String[] args) {


        /*
           2 3 5
           4 8 9
           10 6 7
         */

        int  array [][]={{2,3,5},{4,8,9},{10,6,7}};
        int min=array[0][0];
        int mincoloumn = 0;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (array[i][j]<min)
                {
                    min=array[i][j];
                    mincoloumn =j;
                    System.out.println(mincoloumn);
                }
            }
        }



        //=1
        int max=array[0][mincoloumn];
        int k = 0;
        while(k<3)
        {
            if(array[k][mincoloumn]>max)
            {
                max=array[k][mincoloumn];
            }
            k++;
        }

        System.out.println(max);
    }



}



