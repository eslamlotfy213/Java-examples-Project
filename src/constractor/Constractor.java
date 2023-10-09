package constractor;

import java.util.Calendar;

public class Constractor {



    //default

    public Constractor(){

        System.out.println("i m on the default constractor ...");
        System.out.println("i m on the constractor ...");
    }

   // parameterized
    public Constractor(int a , int b){

        System.out.println("i m on the parameterized constractor ...");
    }


    public String getdata(){

       // System.out.println("Mthod");
        return "Method";
    }


    public static void main(String[] args) {

         Constractor cd = new Constractor();
         cd.getdata();
        System.out.println(cd.getdata());
        // Constractor c = new Constractor(4,5);



    }

}
