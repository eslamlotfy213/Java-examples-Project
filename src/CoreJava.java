public class CoreJava {


    public static void main(String[] args) {


        int myNum = 5;

        String website = "Rahul Shetty Academy";

        char letter = 'r';

        double dec = 5.99;

        boolean myCard = true;

        int [] arr = new int[5];
        arr[0]=3;
        arr[1]=2;
        arr[2]=5;
        arr[3]=5;
        arr[4]=9;
       // arr[5]=6;

        int[]arr2 = {1,2,3,5,7};

        for (int i=0;i< arr2.length;i++){

            System.out.println(arr2[i]);
        }


        String [] name ={"Eslazm","lotfy","Abdddd"};

        for (String s:name){
            System.out.println(s);
        }

        int [] arr3 = {1,44,55,4,6,7,3,12,3,122};

        for (int i=0 ; i < arr3.length ; i++) {
            if (arr3[i]%2==0){
                System.out.println("divided by 2  "+arr3[i]);
               // break;
            }else {
                System.out.println("number not divided by 2  "+arr3[i]);
            }

        }

    }
}
