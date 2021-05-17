package org.example.principle.ocp.improve;


/**
 * @author Castle
 * @Date 2021/5/17 10:53
 */
public class Ocp {
    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.draw(new Triangle());
        draw.draw(new Circle());
    }
}

//使用方
class Draw {

    public void draw(Shape shape) {
        shape.draw();
    }
}

class Shape {
    int type;

    void draw() {

    }
}


class Triangle extends Shape {
    Triangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class Circle extends Shape {
    Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
