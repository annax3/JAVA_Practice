package Ja111_Sprint2.Day_4;

public class Student {
    //state:variable
    int age;
    String name;
    static String batchName="JA111";
    //behaviour : methods
    void play(){
        System.out.println(name+ " is playing...");
    }


    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=23;
        s1.name="Anand";
        //syntax:
        //<objectName>.<methodName>
        s1.play();
        //syntax :
        //<objectName>.<methodName>
        System.out.println(s1.age+" "+s1.name);
        System.out.println(batchName);
        //static : related to class not Object

        Student s180=new Student();
        Student student;
        student = s1;
        System.out.println(s1);
        Student studentNUllObject=null;
        System.out.println(studentNUllObject.name);//null.name


    }
}
