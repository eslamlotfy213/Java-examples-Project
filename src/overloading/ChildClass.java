package overloading;

public class ChildClass extends Classoverloading{



    public void audio(){

        System.out.println(" audio child ...");
    }


    public static void main(String[] args) {


        ChildClass c = new ChildClass();
        c.getData(1);
        c.getData("str");
        c.getData(1,2);

        c.audio(); // overriding same name and same signature parameter , everything same name


    }


}
