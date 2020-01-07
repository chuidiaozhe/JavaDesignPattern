package principle.inversion;

public class DependenceInversion2 {
    public static void main(String args[]){
            Person2 person = new Person2();
            person.receiver(new Email2());
            person.receiver(new WeiXin());
    }
}

interface IReceiver{
    String getInfo();
}

class Email2 implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息：Hello world";
    }
}

class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息：hello，ok";
    }
}

class Person2{
    //这里我们是对接口的依赖
    public void receiver(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}