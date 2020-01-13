package factory.methodfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("伦敦奶酪披萨，准备中。。。");
    }
}
