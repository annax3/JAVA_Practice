package Ja111_Sprint2.Day_5;

import java.util.Scanner;

public class _1InputTakingJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = scanner.nextInt();
        System.out.println("Enter Your name");
        String name = scanner.next();
        System.out.println(name+" "+age);
        scanner.close();


    }
}
