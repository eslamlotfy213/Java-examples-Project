import java.util.Scanner;

public class Testin2 {


    public  static boolean getdata(String myString){

        char[] myArray = myString.toCharArray();
        boolean result = false;

        for(int i = 0; i < myArray.length; i++)
        {
            if(myArray[i] == 'a' && myArray[i+3] == 'b'){
                result = true;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter any String: ");
        //String myString = kbd.nextLine();
        System.out.println(Testin2.getdata(kbd.nextLine()));
    }
}
