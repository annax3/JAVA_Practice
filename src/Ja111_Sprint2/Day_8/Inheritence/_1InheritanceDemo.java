package Ja111_Sprint2.Day_8.Inheritence;

public class _1InheritanceDemo {
    //Is a class relationship :
    //1.Dolphin is a Fish
    //2.Nano is a car
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swim();
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        dolphin.jump();
        //Fish.jum();
    }
}
class Fish{
    void swim(){
        System.out.println("Fish is swimming......");
    }
}
//Fish : Parent Class , Super Class , Base Class
//Dolphin: Child class, subclass, Derived class
class Dolphin extends Fish{
void jump(){
    System.out.println("Dolphin is jumping....");
}
}
//Benefits :
//1. Code Reusability