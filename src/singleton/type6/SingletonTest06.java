package singleton.type6;

/**
 * 懒汉式（线程安全，双重检查）
 *
 *   优缺点说明：
 *   1.Double-Check概念是多线程开发中常使用到的，如代码所示，我们进行了两次if(instance == null)
 *     检查，这样就可以保证线程安全了。
 *   2.这样，实例化代码只用执行一次，后面再次访问时，判断if(instance == null),直接return实例化对象，
 *     也避免反复进行方法同步
 *   3.线程安全，延迟加载，效率较高
 *   4.结论：在实际开发中，推荐使用这种单例设计模式
 * */
public class SingletonTest06 {
    public static void main(String args[]){
        System.out.println("懒汉式 4 ，线程安全，双重检查~");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){};

    /**
     * 提供一个静态的公共方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     * 同时保证了效率，推荐使用
     * */
    public static  Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
