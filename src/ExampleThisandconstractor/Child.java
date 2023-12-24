package ExampleThisandconstractor;

import org.testng.annotations.Test;

public class Child extends Parent{


   @Test
   public void Run() {
       P1 p1 = new P1(3);
       System.out.println(p1.increment());
       System.out.println(p1.decrement());

       Todo();

      // Multiply m = new Multiply(3); no need to create obj we make super to send value from child to parent
       System.out.println(p1.multiplthree());

   }


}
