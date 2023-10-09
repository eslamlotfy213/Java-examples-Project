package InterfaceConcepts;

public class Developing implements Learninterface,Domain{




    @Override
    public void invertment() {

    }

    @Override
    public void checkBalace() {

    }

    @Override
    public void checkCredts() {

    }

    @Override
    public void checkMoney() {

    }

    public static void main(String[] args)
    {

        //first interface = obj
        Learninterface l = new Developing();
        l.checkBalace();
        l.checkMoney();


        // secound interface = obj
        Domain d = new Developing();
        d.invertment();

    }



}
