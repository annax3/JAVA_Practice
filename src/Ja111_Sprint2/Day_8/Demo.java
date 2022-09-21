package Ja111_Sprint2.Day_8;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Student_Bean s1 = new Student_Bean(5,"Gopal",788);
        System.out.println(s1);
        System.out.println(s1.displayDetails());

    }
}
class Student_Bean{
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public Student_Bean(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }


    public String displayDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll no. : ");
        int rollNo = sc.nextInt();
        System.out.print("Enter your name : ");
        String studentName = sc.next();
        System.out.print("Enter your marks : ");
        int score = sc.nextInt();



        Student_Bean s1 = new Student_Bean(rollNo,studentName,score);

        return calculateGrade(score);



    }

    private String calculateGrade(int marks){
        if(marks >= 500){
            return "Grade is A";
        }if(marks < 500 && marks >= 400){
            return "Grade is B";
        }

        return "Grade is C";


    }

    @Override
    public String toString(){

        return "Name : "+this.name+" , Roll No. : "+this.roll+" , Marks : "+this.marks+" , Grade : "+this.calculateGrade(marks);
    }

}