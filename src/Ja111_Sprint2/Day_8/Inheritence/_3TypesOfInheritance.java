package Ja111_Sprint2.Day_8.Inheritence;

public class _3TypesOfInheritance {
    //A->B Simple/single
    //A->B->C Multiple/multilevel Inheritance
    /*
         A
         |
        / \
       B   C //Hierarchical
    */
    public static void main(String[] args) {
        Pet pet=new Pet();
       // pet.speak();
        Dog dog=new Dog();
        dog.speak();
    }
}
class Pet{
    void speak(){
        System.out.println("Pet voices...");
    }
}
class Dog extends Pet{
    @Override
    void speak(){
        System.out.println("barking....");
    }
}
class Cat extends Pet{
    @Override
    void speak(){
        System.out.println("Meow...");
    }
}

/*
* multiple inheritance not supported by java
class MultipleInheritance extends Dog, Cat{

}
 */
