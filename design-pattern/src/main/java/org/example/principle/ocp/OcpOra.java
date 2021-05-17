package org.example.principle.ocp;

/**
 * @author Castle
 * @Date 2021/5/17 10:28
 */
public class OcpOra {
    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.draw(new Triangle());
        draw.draw(new Circle());
    }
}

//使用方
class Draw {

    public void draw(Shape shape) {
        if (shape.type == 1) {
            drawTriangle();
        } else if (shape.type == 2) {
            drawCircle();
        }
    }

    public void drawTriangle() {
        System.out.println("绘制三角形");
    }

    public void drawCircle() {
        System.out.println("绘制圆形");
    }
}

class Shape {
    int type;
}

class Triangle extends Shape {
    Triangle() {
        super.type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.type = 2;
    }
}
