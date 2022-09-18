package Ja111_Sprint2.Day_8.Inheritence;

public class _4MultievelInheritence {
    public static void main(String[] args) {
        Child child=new Child();
        child.facialFeatures();
    }
}
class Grandparent{
    void facialFeatures(){
        System.out.println("facialFeatures");
    }
}
class Parent extends Grandparent{}
class Child extends Parent{}
