package Ja111_Sprint2.Day_8.Inheritence;

public class _4MultievelInheritence {
    public static void main(String[] args) {
        Child child=new Child();
        //child.facialFeatures();
    }
}
class Grandparent{
    Grandparent(){
        //super();
        System.out.println("GP");
    }
    void facialFeatures(){
        System.out.println("facialFeatures");
    }
}
class Parent extends Grandparent{
    Parent(){
        // super();
        System.out.println("parent");
    }
}
class Child extends Parent{
    Child(){
        // super();
        System.out.println("child");
    }
}
