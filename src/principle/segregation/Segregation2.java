package principle.segregation;

/**
 * 应传统方法的问题和使用接口隔离原则改进:
 *
 *  1) 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D，如果接口Interface1对于类A和类C
 * 来说不是最小接口，那么类 B 和类 D 必须去实现他们不需要的方法
 * 2) 将接口Interface1拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口 隔离原则
 * 3) 接口Interface1中出现的方法，根据实际情况拆分为三个接口
 *
 * */
public class Segregation2 {

    public static void main(String args[]){
          AT a = new AT();
          a.depend1(new BT()); //AT类通过接口去依赖BT类
          a.depend2(new BT());
          a.depend3(new BT());

          CT c = new CT();
          c.depend1(new DT());//CT类通过接口去依赖（使用）DT类
          c.depend4(new DT());
          c.depend5(new DT());

    }

}

//接口1
interface  Interface1{
    void operation1();
}

//接口2
interface  Interface2{
    void operation2();

    void operation3();
}

//接口3
interface  Interface3{
    void operation4();

    void operation5();
}

class BT implements Interface1,Interface2{

    @Override
    public void operation1() {
     System.out.println("B 实现了 operation 1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation 2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation 3");
    }
}

class DT implements  Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation 1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation 4");

    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation 5");
    }
}

/**
 * AT 类通过接口 Interface1,Interface2 依赖(使用) B 类，但是只会用到 1,2,3 方法
 * */
class AT{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
}

/**
 *  CT 类通过接口 Interface1,Interface3 依赖(使用) D 类，但是只会用到 1,4,5 方法
 * */
class CT{
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend4(Interface3 i){
        i.operation4();
    }

    public void depend5(Interface3 i){
        i.operation5();
    }

}