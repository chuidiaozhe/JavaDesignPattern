package factory.absfactory.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("北京胡椒披萨，准备中。。。");
    }
}
