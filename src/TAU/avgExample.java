package TAU;

public class avgExample {


    public static void main(String[] args) {


        int array[] = {2,6,4,20,16};
        double total =0;


        for (int count=0;count<array.length;count++)
        {
            total+=array[count];
        }

        System.out.println("total:" + total);
        System.out.println("avg:"+ total/ array.length);



    }
}
