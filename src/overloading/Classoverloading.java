package overloading;


// arguments count should be different
// argumenrs data type should be differents

public class Classoverloading {



    public void audio(){

        System.out.println(" audio parent ...");
    }

    public void engine(){
        System.out.println("engine");
    }


    public void getData(int a ){

        System.out.println(a);
    }

    public void getData(int a  , int b){

        System.out.println(a + b);
    }

    public void getData(String  a ){

        System.out.println(a);
    }




}
