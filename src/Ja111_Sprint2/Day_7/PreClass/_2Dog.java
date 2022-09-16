package Ja111_Sprint2.Day_7.PreClass;

public class _2Dog extends  _2Animal{
    //_2Animal : its own method
    void display(){
        System.out.println("My age is "+age);
        eat();
        super.eat();//i don't need my class method i want my parent class method
    }
    @Override// its is used for checking we override correctly
    void  eat(){
        System.out.println("Dog can eat..");//Method overriding
    }

    void display1(){
        System.out.println("Inside display method of dog");
    }
    public static void main(String[] args) {
        _2Dog d1=new _2Dog();
        d1.eat();
        System.out.println(d1.age);
        d1.display();
        d1.display1();
        _2Animal a=new _2Animal();
        a.eat();
        _2Animal b=new _2Dog();
        b.eat();
        //b.display(); I am not able to call display method
        //if super class is referring child class in that way we can not use method
        //of child class, so we use down-casting
        _2Dog d=(_2Dog)b;
        d.display1();



    }
}
