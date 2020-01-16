package adapter.objectadapter;

//适配器类
public class VoltageAdapter implements IVoltage5V {
    private Volate220V volate220V;//关联关系-聚合

    //通过构造器，传入一个Volate220V实例
    public VoltageAdapter(Volate220V volate220V) {
        this.volate220V = volate220V;
    }

    @Override
    public int output5V() {
        //获得到220v电压
        int dst = 0;
        if (volate220V != null){
            int srcV =  volate220V.output220V();//获取220v电压
            System.out.println("使用对象适配器，进行适配~");
            dst = srcV / 44;//转换成5V
            System.out.println("适配完成，输出的电压为="+dst);
        }

        return dst;
    }
}
