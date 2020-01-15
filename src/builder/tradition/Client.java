package builder.tradition;

public class Client {
    public static void main(String[] args){
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        System.out.println("---------------------");
        HighBuildHouse highBuildHouse = new HighBuildHouse();
        highBuildHouse.build();

    }
}
