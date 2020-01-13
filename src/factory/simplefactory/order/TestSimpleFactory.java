package factory.simplefactory.order;

public class TestSimpleFactory {
    public static  void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Orderpizza orderpizza = new Orderpizza(simpleFactory);
    }
}
