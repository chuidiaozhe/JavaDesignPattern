package singleton.type1;

/**
 * 饿汉式（静态常量）
 *
 *  步骤如下：
 *   1.构造器私有化（防止new）
 *   2.类的内部创建对象
 *   3.向外暴露一个静态的公共方法。
 *
 *  优缺点说明：
 *   1.优点：这种写法比较简单，就是在类加载的时候就完成实例化。避免了线程同步问题。
 *   2.缺点：在类装载的时候完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，
 *          则会造成内存的浪费。
 *   3.这种方式基于classloader机制避免了多线程同步的问题，不过，instance在类装载时就实例化，在单例
 *     模式中大多数都是调用getInstance方法，但是导致类装载的原因很多，因此不能确定有其它的方式（或其它的
 *     静态方法）导致类加载，这时候初始化instance就没有达到lazy loading的效果。
 *   4.结论：这种单例模式可用，可能造成内存浪费
 * */
public class SingletonTest01 {
    public static void main(String args[]){
        //测试
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode =" + singleton1.hashCode());
        System.out.println("singleton2.hashCode =" + singleton2.hashCode());
    }
}


class Singleton{
    //1.构造器私有化，外部能new
    private Singleton(){
    }

    //2.本类内部创建对象实例
    private static final  Singleton instance = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}