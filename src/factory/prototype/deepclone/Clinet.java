package factory.prototype.deepclone;

public class Clinet {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");


//        DeepProtoType p2 = (DeepProtoType) p.clone();
//
//        System.out.println("p.name=" + p.name + "  p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        p.name = "鲁智深";

        System.out.println("p.name=" + p.name + "  p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }
}
