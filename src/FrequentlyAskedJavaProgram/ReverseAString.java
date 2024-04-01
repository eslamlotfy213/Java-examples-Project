package FrequentlyAskedJavaProgram;

public class ReverseAString
{
    public static void main(String[] args) {

    String str = "ABCDEFGHJUTO";
    String rev="";



        // convert +
        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);


        // convert string to char array
        String str2 = "greeen";
        String rev2="";
        char a[]=str2.toCharArray();

        for (int i = a.length-1; i >= 0; i--)
        {
            rev2=rev2+a[i];
        }
        System.out.println(rev2);

        //using String buffer
        String str3 = "buffer";
        String rev3="";
        StringBuffer sb = new StringBuffer(str3);
        System.out.println(sb.reverse());

    }

}
