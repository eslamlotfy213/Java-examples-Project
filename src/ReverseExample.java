public class ReverseExample {

    public static void main(String[] args) {


        String str = "Rahul Shetty Academy";

        for (int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }


        System.out.println();
        System.out.println("-----------------------------------------------------");


        for (int i = str.length()-1; i >=0; i--)
        {
            System.out.print(str.charAt(i));
        }

    }
}
