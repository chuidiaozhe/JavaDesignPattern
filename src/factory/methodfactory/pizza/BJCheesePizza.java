package factory.methodfactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("北京奶酪披萨，准备中。。。");
    }
}
