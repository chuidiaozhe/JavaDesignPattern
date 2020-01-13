package singleton.type3;

/**
 * 懒汉式（线程不安全）
 *
 *  优缺点说明：
 *   1.起到了Lazy Loading的效果，但是只能在单线程下使用
 *   2.如果在多线程下，一个线程进入了if(instance == null)判断语句块，还未来得及往下执行，另一个
 *     线程也通过了这个判断语句，这时候便会产产生多个实例。所以在多线程环境下不可使用这种方法。
 *   3.结论：在实际开发中，不要使用这种方法
 * */
public class SingletonTest03 {
    public static void main(String args[]){
        System.out.println("懒汉式 1 ， 线程不安全~");
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
     * 提供一个静态的公共方法，当使用到该方法时，才去创建instance
     * */
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
