package principle.ocp;

/**
 * 优缺点：
 *  1.优点是比较好理解，简单易操作
 *  2.缺点是违反了设计模式的OCP原则，即对扩展开放（提供方），对修改方关闭（使用方）。即当我们给类增加新功能的时候，
 *    尽量不修改代码，或者尽可能少修改代码。
 *  3.比如我们这时要新增加一个图形种类 三角形，我们需要修改的地方比较多
 * */

public class OcpImprove {
    public static void main(String[] args) {
//使用看看存在的问题
        GraphicEditorP graphicEditor = new GraphicEditorP();
        graphicEditor.drawShape(new RectangleP());
        graphicEditor.drawShape(new CircleP());
        graphicEditor.drawShape(new TriangleP());
    }
}

//这是一个用于绘图的类【使用方】
class GraphicEditorP {
    //接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(ShapeP s) {
     s.draw();
    }

}

//Shape 类，基类
 abstract class ShapeP {
    int m_type;
    public abstract  void draw();//抽象方法
}

class RectangleP extends ShapeP {
    RectangleP() {
        super.m_type = 1;
    }

    @Override
    public void draw() {

            System.out.println(" 绘制矩形 ");
    }
}

class CircleP extends ShapeP {
    CircleP() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class TriangleP extends ShapeP {
    TriangleP() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}
