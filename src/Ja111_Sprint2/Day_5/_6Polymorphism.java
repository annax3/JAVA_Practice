package Ja111_Sprint2.Day_5;

import java.util.Scanner;

public class _6Polymorphism {
    public static void main(String[] args) {
        Maths sum=new Maths();
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        System.out.println(sum.add(x,y,z));
        System.out.println(sum.add(x,y));
        System.out.println(sum.square(x));
        System.out.println(sum.square((byte)x));
    }
}
class Maths{
    //Polymorphism:
    //1.static binding, compile time polymorphism, method overloading
    //2. we will learn later
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    int square(int x){
        System.out.println("int");
        return x*x;
    }
    int square (byte b){
        System.out.println("byte");
        return b*b;
    }
}
//Rules
//return type can be same or diff
//args list should be different