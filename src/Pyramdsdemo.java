public class Pyramdsdemo {


    public static void main(String[] args) {


        for (int i = 0; i <= 4; i++)
        {

                        System.out.print(i+"start outer");
                            for (int j = 1; j<=4-i ; j++)
                            {
                                System.out.print(j);
                            }
                       System.out.print(i+"end outer");

            System.out.println();
        }


    }








}
