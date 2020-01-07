package principle.inversion;

public class DependenceInversion  {
    public static void main(String args[]){
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello, world";
    }
}

/**
 * 完成Person接收消息的功能
 * 方式1分析：
 *  1.简单，比较容易想到
 *  2.如果我们获取的对象是微信、短信、等等，则新增类，同时Person也要增加相应的接收方法
 *  3.解决思路：引入一个抽象的接口IRecive,表示接受者，这样Person类与接口IReceive发生依赖
 *    以为Email、微信等等属于接收的范围，他们各自实现IReciver接口就OK，这样我们就符合依赖倒转原则
 *
 * */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
