package Ja111_Sprint2.Day_3;

public class _1ObjectDemo {
    public static void main(String[] args) {
        //Create object of the class A
        //let a = new A();
        //syntax
        //Type var_name =  new Class()
        A a=new A();// A() is method called constructor new is operator is used to create the object of A
        A a1= new A();
        a.sayHello();
    }
}
class A{
    int variable=10;//variable
    void sayHello(){//method
        //class is like a capsule in this capsules variable and methods are present
        System.out.println("Hello");
    }
    A(){//constructor
        System.out.println("Constructor called.");
    }

}