package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testing {


    /*
     ArrayList  // is a class
     need to create a pbject from class
      add() to add data
      get() to extract data
      contains() to check values
      convert array to arraylist using Arrays.asList()
     */


    public static void main(String[] args) {
        //int [] array = new int[5]; create a memory allocated

        ArrayList<String> a = new ArrayList<String>();
        // create object of class  ? obj.method
        a.add("Eslam");
        a.add("ABS");
        a.add("CVB");

//        System.out.println(a.get(2));
//

        for (int i = 0; i < a.size(); i++) {

            System.out.println(a.get(i));
        }

        System.out.println("**************************************");

        for (String val : a){
            System.out.println(val);
        }

        System.out.println("**************************************");



        //item is presented
        //convert array to lis using Arrays.asList();
        //now you can use contains methods

        String [] name = {"ABB", "Raukkk", "Selenium"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("Selenium");




    }






}
