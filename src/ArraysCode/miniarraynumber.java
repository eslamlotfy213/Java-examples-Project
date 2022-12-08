package ArraysCode;

public class miniarraynumber {


    public static void main(String[] args) {

        int abc [][] = {{2,4,5,},{3,4,7},{1,2,9}};
        int mini = abc[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
            {

                if (abc[i][j]<mini){

                mini=abc[i][j];
                }
            }
        }

        System.out.println(mini);


    }
}
