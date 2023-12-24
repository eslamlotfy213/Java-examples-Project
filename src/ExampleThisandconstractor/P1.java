package ExampleThisandconstractor;

public class P1 extends  Multiply{

    int a;

    public P1(int a) {
        super(a);
        //super(a);
        this.a = a;   // this refere to current class variable
    }


    public int increment(){
       a =a+1;
       return a;
    }


    public int decrement(){
        a =a-1;
        return a;
    }








}
