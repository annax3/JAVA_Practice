package Ja111_Sprint2.Day_9;

public class _4SuperKeyword {
    //this
    //point to the super class, super class constructor we use 'super' keyword
    /*
    *Usage of Super keyword :
      1. super can be used to refer to the immediate parent class instance variable.
      2. super can be used to invoke the immediate parent class method. super.method()
      3. super() can be used to invoke immediate parent class constructor. super();
     */
    public static void main(String[] args) {
        Dog dog=new Dog();
        //dog.printColor();
        dog.display();
    }
}
//1. super can be used to refer to the immediate parent class instance variable.
//2. super can be used to invoke the immediate parent class method. super.method()
class Animal{
    String color="white";
    void eat(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal {
    String color = "black";
    @Override
    void eat(){
        System.out.println("dog eats");
    }
    Dog(){
        //super();//System.out.println("Animal Constructor");
        // super("asdf");
        System.out.println("Dog Constructor");
    }
    /*
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }

     */
    void display(){
        System.out.println(color); //black
        System.out.println(super.color);

        eat();
        super.eat();


    }
}
//compiler does 2 things :
//it gives you a default constructor
//the first Line in each constructor is call to
//the super constructor super();
