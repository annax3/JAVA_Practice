package Ja111_Sprint2.Day_9;

public class _5Binding {
    //Two types of polymorphism :
    //method overloading.aka compile time polymorphism aka static binding
    //method overriding.dynamic binding(decided at run time) run time polymorphism
    void one(String s){}
    void one(Integer i){}

    public static void main(String[] args) {
        _5Binding ob = new _5Binding();
        ob.one("asdfg");
    }

}
