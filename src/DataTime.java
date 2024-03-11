import java.util.Date;

public class DataTime {


    public static void main(String[] args) {


        Date d = new Date();

        String timestamp1 =d.toString();
        System.out.println(timestamp1);

        String timestamp2 =d.toString().replace(":","_").replace(" ","_");
        System.out.println(timestamp2);
    }
}
