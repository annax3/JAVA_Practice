package Ja111_Sprint2.Day_5;

import java.util.Scanner;

public class _4MethodDemo {
    public static void main(String[] args) {
        //call a method
        Simple simple = new Simple();
        simple.methodName();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int fact = simple.factorial(number);
        System.out.println(fact);
        int sum=simple.sum(x,y);
        System.out.println(sum);
    }
}
class Simple{
   /* <access specifier><return type><Method name>(<arg List){
        //method body
        return 0;
    }*/
    void methodName(){
        System.out.println("Inside the body of the method");
    }
    int factorial(int num){
        if(num==1||num==2)
            return num;
        else
            return num*factorial(num-1);
    }
    int sum(int x,int y){
        return x+y;
    }
}