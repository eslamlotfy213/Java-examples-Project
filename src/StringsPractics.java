public class StringsPractics {


    public static void main(String[] args) {


        String str = "payment $100 dollar";
        System.out.println(str.indexOf("$"));
        System.out.println(str.charAt(8));
        System.out.println(str.substring(8));  // return beiggning + inclusive -> $100 dollar



        String str2 = "payment";
        System.out.println(str2.length()); // p a y m e n t   7 charachters

    }

}
