package InterfaceConcepts;

public class Developing implements Learninterface,Domain{


    public static void main(String[] args) {

        Learninterface l = new Developing();
        l.checkBalace();
        l.checkBalace();
        l.checkMoney();

        Domain d = new Developing();
        d.invertment();
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

    @Override
    public void invertment() {

    }
}
