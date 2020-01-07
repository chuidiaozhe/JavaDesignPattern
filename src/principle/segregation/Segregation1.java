package principle.segregation;

/**
 * 问题描述：
 *  这种方法引入了大量不使用的方法
 *
 * */
public class Segregation1 {
    public static void main(String args[]){

    }

}
//接口
interface  IInterface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements  IInterface1{

    @Override
    public void operation1() {
      System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}

class D implements  IInterface1{

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

//A类通过接口IInterface1依赖（使用）B类，但是只用到1，2，3方法
class A{
    public void depend1(IInterface1 i){
        i.operation1();
    }
    public void depend2(IInterface1 i){
        i.operation2();
    }
    public void depend3(IInterface1 i){
        i.operation3();
    }
}

//C类通过接口IInterface1依赖（使用）D类，但是只用到1，4，5方法
class C{
    public void depend1(IInterface1 i){
        i.operation1();
    }
    public void depend4(IInterface1 i){
        i.operation4();
    }
    public void depend5(IInterface1 i){
        i.operation5();
    }
}



