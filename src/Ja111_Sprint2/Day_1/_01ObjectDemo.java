package Ja111_Sprint2.Day_1;

public class _01ObjectDemo {
    public static void main(String[] args){
        //Create object of the class A
        //let a = new A();
        //Syntax : Type var_name= new Class()
        A  a=new A();
        A a1=new A();
        a1.sayHello();

    }
}
class A{
    int variable = 10;
    void sayHello(){
        System.out.println("Hello");
    }
    A(){//constructor
        System.out.println("Constructor Called.");
    }
}