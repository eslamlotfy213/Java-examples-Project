public class childClass extends ParentClass{



    public void c()
    {
        System.out.println("come from ParentClass");
    }

    public void c1()
    {
        System.out.println("come from ParentClass");
    }

    public static void main(String[] args) {



        ParentClass parentClass = new childClass();

        parentClass.p();
        parentClass.p1();
    }
}
