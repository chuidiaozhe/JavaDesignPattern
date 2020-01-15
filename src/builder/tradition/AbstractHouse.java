package builder.tradition;

/**
 *
 *使用传统方式完成需求
 * */
public abstract class AbstractHouse  {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract  void buildWalls();
    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
