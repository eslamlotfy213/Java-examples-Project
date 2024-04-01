package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class PalindromeString {


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
    String str= scanner.next();
    String org_str= str;
    String rev = "";

    for (int i=str.length()-1;i>=0;i-- )
    {
        rev=rev+str.charAt(i);
    }


    if (org_str.equals(rev)){
        System.out.println(org_str + " is Palindrome ");
    }else {
        System.out.println(org_str + " is not PalindromeS");
    }


    }
}
