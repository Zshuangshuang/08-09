package com.Zss.www;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-09
 * Time:7:49
 **/
class Animal{
    public String name;
    public void eat(){
        System.out.println(this.name+"Animal:正在吃！");
    }
    public Animal(String name){
        this.name = name;
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public int age;
    public void eat(){
        System.out.println(this.name+"Cat::正在吃");
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}
public class TestDemo2 {
    public static void eat(Animal animal){
        animal.eat();
    }
    public static Animal eat(){
        return new Cat("木木");
    }
    public static void main(String[] args) {
       /* Animal animal = new Cat("果果");
        animal.eat();*/
       /*eat(new Cat("黎黎"));*/
      /*  Animal animal = eat();*/
      /*  animal.eat();*/
        Animal animal = new Cat("mimic");


        if (animal instanceof Bird)  {
            Bird bird = (Bird) animal;
                 bird.fly();      
        }

    }
}
