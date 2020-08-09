package com.Zss.www;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-09
 * Time:7:39
 **/
class Shape{
    public void draw(){

    }
}
class Cycle extends Shape{
    public void draw(){
        System.out.println("想画一个○");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("想画一个△");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("想画一个♦");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("想画一朵❀");
    }
}

public class TestDemo1 {
    public static void drawMap(Shape shape){
       shape.draw();
    }
    public static void main(String[] args) {
        Shape shape = new Flower();
        Shape shape1 = new Cycle();
        Shape shape2 = new Triangle();
        drawMap(shape);
    }
}
