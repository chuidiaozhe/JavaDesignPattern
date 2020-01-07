package principle.liskov;

/**
 * 我们发现原来运行正常的相减功能发生了错误。原因就是类B无意中重写了父类的方法，造成原有功能出现错
 * 误。在实际编程中，我们常常会通过重写父类的方法完成新的功能，这样写起来虽然简单，但整个继承体系的
 * 复用性会比较差。特别是运行多态比较频繁的时候
 * <p>
 * 通用的做法是:原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚合，组合等 关系代替.
 */
public class LiskovImprove {
    public static void main(String[] args) {
        ImproveA a = new ImproveA();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = " + a.func1(1, 8));

        System.out.println("-------------------");


        ImproveB b = new ImproveB();
        //因为 B 类不再继承 A 类，因此调用者，不会再 func1 是求减法
        // 调用完成的功能就会很明确
        System.out.println("11+3=" + b.func1(11, 3));//这里本意是求出 11+3

        System.out.println("1+8=" + b.func1(1, 8)); // 1+8
        System.out.println("11+3+9=" + b.func2(11, 3));
        //使用组合仍然可以使用到 A 类相关方法
        System.out.println("11-3=" + b.func3(11, 3));// 这里本意是求出 11-3

    }
}

//创建一个更加基础的基类
class Base {
    //把更加基础的方法成员写到Base类
}

class ImproveA extends Base {
    //返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//增加了一个新功能：完成两个数相加，然后和9求和
class ImproveB extends Base {
    private ImproveA a = new ImproveA();

    //这里，重写了A类的方法，可能是无意识的
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //我们仍然想使用A的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
