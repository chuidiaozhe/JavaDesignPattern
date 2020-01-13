package factory.simplefactory.order;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;
import factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Orderpizza {


    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public Orderpizza(SimpleFactory factory){
        setFactory(factory);
     }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";// 用户输入的
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出Pizza
            if (pizza != null){//订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败 ");
                break;
            }
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
