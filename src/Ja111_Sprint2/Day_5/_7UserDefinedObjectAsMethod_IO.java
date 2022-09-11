package Ja111_Sprint2.Day_5;

import java.util.Scanner;

public interface _7UserDefinedObjectAsMethod_IO {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Enter employee age : ");
        Scanner scanner=new Scanner(System.in);
        int age = scanner.nextInt();
        employee.age=age;
        System.out.println(myMethod(employee));
        Employee employee1=createObject();
    }
    static  int myMethod(Employee employee){
        return employee.age;
    }
    static Employee createObject(){
        //null is the subType of all the objects
        //return null;
        return new Employee();
    }


}
class Employee{
    int age;
}

