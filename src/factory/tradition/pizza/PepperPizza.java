package factory.tradition.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("胡椒披萨，准备中。。。");
    }
}
