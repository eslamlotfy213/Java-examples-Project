package TAU;

public class Example1
{
    public static void main(String[] args)
    {
        char[] arr = {'a', 'b', 'c', 'd', 'c', 'a'};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length ; j++)
            {
                if(arr[j]==arr[i])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}