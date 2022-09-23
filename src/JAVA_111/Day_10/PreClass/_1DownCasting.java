package JAVA_111.Day_10.PreClass;

public class _1DownCasting {
    public static void main(String[] args) {
        String s="hello";
        Object o=s;//upcasting.
        System.out.println(s instanceof String);//true
        System.out.println(s instanceof  Object);//true
        //Down casting
        Animal parent = new Dog();//upcasting
        parent.eat();
        //parent.bark();//Compile time error
        //parent instance of Animal
        //parent instanceof dog
        //dog.bark(); error can we convert dog object into parent object ? ans is yes by casting
        Dog dog=(Dog) parent;
        dog.bark();//error removed
        downcasting(parent);
        Animal purelyAnimal=new Animal();
        downcasting(purelyAnimal);// class-casting exception
    }
    //static method
    static void downcasting(Animal animal){
        //my program shouldn't throw any exception
        if(animal instanceof  Dog){
            Dog dog=(Dog) animal;
            System.out.println("casted");
        }
       else {
            System.out.println("This will not print");
        }

    }
}
class Animal{
    void eat(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("dog eats");
    }
    void  bark(){
        System.out.println("dog barks");
    }
}