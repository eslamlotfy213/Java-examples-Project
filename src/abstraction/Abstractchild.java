package abstraction;

public class Abstractchild extends AbstractParent{

    public static void main(String[] args)
    {

        //interface
        // all methods seems abstract only   public void method();
        //implments keyword
        // should be public


        //abstraction
        // The abstract Class >  cannot be instantiated
        //abstraction.AbstractParent a = new abstraction.AbstractParent();
        //extends keyword
        // except private methods nd variables should be public / protected


        Abstractchild c = new Abstractchild();
        c.move();  //  abstract methods
        c.walk(); // abstract methods
        c.go(); // non abstract methods

    }


    @Override
    public void walk()
    {
        System.out.println("walk");
    }

    @Override
    protected void move() {
        System.out.println("move");
    }


}
