package methodChaining;

public class oldMethodChaining {


    public static void main(String[] args) {

        oldMethodChaining old = new oldMethodChaining();
        old.a1();
        old.a2();
        old.a3();
    }

    public void a1()
    {
        System.out.println("a1");
    }

    public void a2(){
        System.out.println("a2");
    }

    public void a3()
    {
        System.out.println("a3");
    }
}
