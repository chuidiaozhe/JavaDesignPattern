package bridge;

//直立式手机类，继承抽象类Phone
public class UpRightPhone extends Phone {
    //构造器
    public UpRightPhone(Brand mBrand) {
        super(mBrand);
    }

    public void open(){
        super.open();
        System.out.println("直立式手机");
    }

    public void close(){
        super.close();
        System.out.println("直立式手机");
    }

    public void call(){
        super.call();
        System.out.println("直立式手机");
    }
}
