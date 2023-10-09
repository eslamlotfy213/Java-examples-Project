import java.util.ArrayList;
import java.util.Date;

public class Corejava2 {

    public static void main(String[] args) {



        String sp = "eslam Look Car";

        String [] arraysplir = sp.split("Look");

        System.out.println(arraysplir[0]);
        System.out.println(arraysplir[1]);
        System.out.println(arraysplir[1].trim());

        System.out.println("=============================================================================");
        for (int i= sp.length()-1;i>=0;i-- ){

            System.out.println(sp.charAt(i));
        }

        for (int i=0;i< sp.length()-1;i++ ){

            System.out.println(sp.charAt(i));
        }
        System.out.println("=============================================================================");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.remove(1);

        for (int s : arrayList) {

            System.out.println(s);
        }
        System.out.println("=============================================================================");

        String  s = "AAAAAA";
        String s1 = "BBBBBB";

        String str = new String("Welcome");
        String str1 = new String("Welcome2");

        System.out.println(str + " " +str1);
        System.out.println("=============================================================================");


        int x=15;
        int y= 13;

        System.out.println( x> 13 && y > 13);
        Date d = new Date();

        int i=0;
        while (i< 12){
            System.out.println(i);
            i++;
        }

    }

}
