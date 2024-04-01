package TAU;

public class SearchinganElementinArray {


    public static void main(String[] args) {


        int array[] = {10,20,40,30,20};
        int search_ele= 30;
        boolean flag=false;
        for (int i=0; i<array.length;i++)
        {
            if (search_ele == array[i])
            {
                System.out.println("Element Found " + i);
                flag = true;
                break;
            }
        }

       if (flag==false){
           System.out.println("Element Not Found");
       }

    }
}
