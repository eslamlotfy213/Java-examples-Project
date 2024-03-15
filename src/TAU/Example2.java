package TAU;

public class Example2 {

        public static void main (String[] args) {

            String str= "Geeks", nstr="";
            char ch;

            System.out.print("Original word: ");
            System.out.println("Geeks"); //Example word

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                nstr= ch+nstr;
            }
            System.out.println(nstr);
        }
    }

