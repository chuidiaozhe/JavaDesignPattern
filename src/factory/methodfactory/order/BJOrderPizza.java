package factory.methodfactory.order;

import factory.methodfactory.pizza.BJCheesePizza;
import factory.methodfactory.pizza.BJPepperPizza;
import factory.methodfactory.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
