package singleton.type5;

/**
 * 懒汉式（线程安全，同步代码块）
 *
 * 开发中，不推荐使用这种方法
 * */
public class SingletonTest05 {
    public static void main(String args[]){
        System.out.println("懒汉式 3 ，线程安全，同步代码块~");
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
     * 提供一个静态的公共方法
     * */
    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

}
