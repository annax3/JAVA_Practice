package Ja111_Sprint2.Day_5;

public class _8Constructor {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        MyClass anotherObject= new MyClass(10);
        System.out.println(anotherObject.variable);
    }
}
class MyClass{
    int variable;
    //default constructor
    MyClass(){
        System.out.println(" ");
    }
    //parameterized constructor
    MyClass(int var){
        variable=var;
    }
}
//Similarities constructor and method
//both are function
//both have arg list
//both of the, can be overloaded

//static ? No constructor can't be static
//return type ? constructor doesn't have a return type, not even void
//a method can have any name, but cons. can only the name same as the classname.