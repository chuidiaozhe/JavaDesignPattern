package adapter.objectadapter;

public class Client {
    public static void main(String[] args){
        System.out.println("=========对象适配器模式========");
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Volate220V());
        Phone phone = new Phone();
        phone.charging(voltageAdapter);
    }
}
