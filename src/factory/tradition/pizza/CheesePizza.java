package factory.tradition.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("奶酪披萨，准备中。。。");
    }
}
