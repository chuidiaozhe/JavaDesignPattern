package factory.tradition.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("希腊披萨，准备中。。。");
    }
}
