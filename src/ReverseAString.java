public class ReverseAString {


    public static void main(String[] args)
    {
        //A  0
        //B  1
        //C  2
        //D  3

        String str = "ABCDEFG";
        String rev="";

        for (int i = str.length()-1;i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

    }
}
