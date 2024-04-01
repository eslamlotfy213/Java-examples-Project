package TAU;

public class Sort {
    public static void main(String[] args)
    {
        int arr[] = {5,2,8,7,1,0};
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] +" ");



        int temp=0;
        for (int i = 0; i< arr.length; i++) {
            for (int j=i+1; j < arr.length; j++) {
                if(arr[j]<arr[i])
                {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }



        System.out.print("\nSorted array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] +" ");


    }
}