package com.Interface.www;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-09
 * Time:10:39
 **/
interface Shape{
   public abstract void draw();
}
class Cycle implements Shape{
    public void draw(){
        System.out.println("画个○");
    }
}
class Flower implements Shape{
    public void draw(){
        System.out.println("画朵❀");
    }
}
public class TestInterface {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new Flower();
        drawMap(shape1);
        drawMap(shape2);
    }
}
