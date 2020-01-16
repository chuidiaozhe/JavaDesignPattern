package bridge;

//折叠式手机类，继承抽象类Phone
public class FoldedPhone extends Phone {
    //构造器
    public FoldedPhone(Brand mBrand) {
        super(mBrand);
    }

    public void open(){
        super.open();
        System.out.println("折叠式手机");
    }

    public void close(){
        super.close();
        System.out.println("折叠式手机");
    }

    public void call(){
        super.call();
        System.out.println("折叠式手机");
    }
}
