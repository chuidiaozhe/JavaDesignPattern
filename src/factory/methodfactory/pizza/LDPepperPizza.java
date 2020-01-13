package factory.methodfactory.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("伦敦胡椒披萨，准备中。。。");
    }
}
