package factory.absfactory.pizza;

public class Pizza  {

    private String name = "";

    public void setName(String name){
        this.name = name;
    }

    public void prepare(){

    }

    public void bake(){
     System.out.println(name + " 烧烤中。。。");
    }

    public void cut(){
        System.out.println(name + " 切割。。。");
    }

    public void box(){
        System.out.println(name + " 打包。。。");
    }
}
