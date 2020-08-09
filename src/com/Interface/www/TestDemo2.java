package com.Interface.www;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-09
 * Time:10:57
 **/
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
}
interface IFlying{
     void fly ();
}
interface IRunning{
    void run();
}
interface IWalking{
    void walk();
}
interface ISwimming{
    void swim();
}
class Cat extends Animal implements IRunning{
    public Cat(String name){
       super(name);
    }
    public void run(){
        System.out.println(this.name+"正在用四条腿跑");
    }
}
class Frog extends Animal implements ISwimming,IWalking,IRunning{
    public Frog(String name){
        super(name);
    }
    public void swim(){
        System.out.println(this.name+"正在游");
    }
    public void walk(){
        System.out.println(this.name+"正在走");
    }
    public void run(){
        System.out.println(this.name+"正在跑");
    }
}
class Fish extends Animal implements ISwimming{
    public Fish(String name){
        super(name);
    }
    public void swim(){
        System.out.println(this.name+"正在游");
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
      ISwimming iSwimming = new Frog("瓜瓜");
      iSwimming.swim();
    }
}
