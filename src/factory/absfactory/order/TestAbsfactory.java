package factory.absfactory.order;

public class TestAbsfactory {
    public static void main(String[] args){
        LDFactory ldFactory = new LDFactory();
        BJFactory bjFactory = new BJFactory();
        new OrderPizza(bjFactory);

    }
}
