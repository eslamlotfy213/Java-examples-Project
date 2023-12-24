public class Printminnumber {


    public static void main(String[] args) {



        /*
           2    3   5
           4    8   9
           1    6   7

         */

        int  array [][]={{2,3,5},{4,8,9},{1,6,7}};
        int min=array[0][0];
        int max=array[0][0];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                   if (array[i][j]<min)
                   {
                     min=array[i][j];
                   }


                if (array[i][j]>max)
                {
                    max=array[i][j];
                }
            }
        }

        System.out.println(min);

        System.out.println(max);


    }
}
