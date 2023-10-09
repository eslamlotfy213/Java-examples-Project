public class Testing {



    public static int toBinaryString(String des){
        int decime = Integer.parseInt(des,2);
        return decime;
    }

    public static void main(String[] args) {

        System.out.println(Testing.toBinaryString("100000010"));

    }
}
