package builder.tradition;

//修建高楼
public class HighBuildHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
    System.out.println("修建高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("修建高楼砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("修建高楼封顶");
    }
}
