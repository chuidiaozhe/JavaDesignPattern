package adapter.classadapter;

//适配器类
public class VoltageAdapter  extends Volate220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获得到220v电压
        int srcV = output220V();
        int dstV = srcV / 44;//转换成5V
        return dstV;
    }
}
