package ArraysCode;

public class mininnumbericolumn {


    public static void main(String[] args) {

        //2   4   5
        //3   7   10
        //6   1   9


        int abc[][] = {{2, 4, 5}, {3, 7, 10}, {6, 1, 9}};
        int mini = abc[0][0];
        int mincolumn=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (abc[i][j] < mini) {

                    mini = abc[i][j];
                    mincolumn = j;
                }
            }
        }

        int max= abc[0][mincolumn];
        int k=0;
        while (k<3){

            if (abc[k][mincolumn] > max){
                max=abc[k][mincolumn];
            }
            k++;
        }



        System.out.println(mini);
        System.out.println(max);


    }

}
