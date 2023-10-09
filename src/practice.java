import java.util.Scanner;

public class practice {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();


            //Complete this line
            int len = s1.length();
            int space = 15 - len;
            String s2 = "";
            for(int j=0; j<space; j++)
            {
                s2 = s2 + " ";

                System.out.println("s2"+ s2);
            }

//            if(x<10){
//                System.out.println(s1 + s2 + 0 + 0 + x);
//            } else if(x<100) {
//                System.out.println(s1 + s2 + 0 + x);
//            } else {
//                System.out.println(s1 + s2 + x);
//            }
        }

        System.out.println("================================");

        sc.close();

    }
}
