package InterfaceConcepts;

public class CenterClass implements  CenterTrafficInterface,CenterTrafficInterface2{



    public static void main(String[] args) {

        //interface variablerefre = new classnamw
        CenterTrafficInterface c = new CenterClass();
        c.greenGo();
        c.redGo();

        CenterTrafficInterface2 c2 = new CenterClass();
        c2.simple();
    }

    @Override
    public void greenGo() {
        System.out.println("greenGo");
    }

    @Override
    public void redGo() {


        System.out.println("redGo");
    }

    @Override
    public void simple() {

        System.out.println("simple");
    }
}
