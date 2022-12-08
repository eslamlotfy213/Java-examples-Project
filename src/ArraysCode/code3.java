package ArraysCode;

public class code3 {


    public static void main(String[] args) {



        int a[][] = new int[2][3];
        a[0][0]=1;
        a[0][1]=3;
        a[0][2]=5;
        a[1][0]=9;
        a[1][1]=8;
        a[1][2]=25;

      //  System.out.println(a[1][0]);

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j <3; j++) {

                System.out.println(a[i][j]);
            }

        }


    }
}
