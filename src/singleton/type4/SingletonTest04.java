package singleton.type4;

/**
 * 懒汉式（线程安全，同步方法）
 *
 *  优缺点说明：
 *  1.解决了线程安全问题
 *  2.效率太低了，每个线程在想获得类的实例的时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次
 *    实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低。
 *  3.结论：在实际开发中，不推荐使用这种方法
 * */
public class SingletonTest04 {
    public static void main(String args[]){
        System.out.println("懒汉式 2 ， 线程安全，同步方法~");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){};

    /**
     * 提供一个静态的公共方法，加入同步处理的代码，解决线程安全问题
     * */
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
