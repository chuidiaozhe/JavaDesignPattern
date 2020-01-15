package prototype.improve;

public class Sheep  implements Cloneable{
    private String name;
    private String color;
    private int age;
    private String address = "蒙古羊";
    public  Sheep friend;//是对象，克隆会如何处理，默认是浅拷贝

    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                 '}';
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone()   {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sheep;
    }
}
