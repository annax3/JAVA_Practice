package Ja111_Sprint2.Day_7;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public  String toString(){
        return "Hello from"+name;
    }
}
