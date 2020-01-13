package factory.tradition.order;

import factory.tradition.pizza.CheesePizza;
import factory.tradition.pizza.GreekPizza;
import factory.tradition.pizza.PepperPizza;
import factory.tradition.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 传统的方式的优缺点：
 *  1.优点比较好理解，简单易操作
 *  2.缺点是违反了设计模式的OCP原则，即对扩展开放，对修改关闭，。即当我们给类增加新功能的时候，
 *    尽量不修改代码，或者尽可能少修改代码
 *  3.比如我们这时要新增加一个Pizza的种类，需要修改OrderPizza代码
 *  4.改进的思路分析：
 *    分析：修改代码可以接受，但是如果我们在其他的地方也有创建Pizza的代码，就意味着也需要修改，
 *         而创建Pizza的代码，往往有多处。
 *    思路：把创建Pizza对象分装到一个类中，这样我们有新的Pizza种类时，只需要修改该类就可以，其它
 *         有创建到Pizza对象的代码不需要修改 -》 简单工厂模式
 *
 *
 * */
public class OrderPizza {
    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";//订购披萨的类型
        do {
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if(orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else{
                break;
            }
            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }


    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){
        try {
            BufferedReader strin  =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类：");
            String str = strin.readLine();
            return str;
        }catch ( IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
