package bridge;

public abstract class Phone {
    //组合品牌
    private Brand mBrand;

    //构造器
    public Phone(Brand mBrand) {
        this.mBrand = mBrand;
    }

    protected void open(){
        this.mBrand.open();
    }

    protected void close(){
        this.mBrand.close();
    }

    protected  void call(){
        this.mBrand.call();
    }

}
