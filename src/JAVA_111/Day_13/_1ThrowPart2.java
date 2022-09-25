package JAVA_111.Day_13;

import java.io.IOException;

public class _1ThrowPart2 {
    public static void main(String[] args) throws IOException {
        //validate(20);
        try {
            validate(17);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("To cast your vote your age should be at least 18");
        }
    }
    static  void validate (int age) throws IOException {
        if(age<18){
            //ArithmeticException Runtime-unchecked
              //IOException- compile Time_checked

            throw new IOException("age<18");
            //options:
            //1 Declare : the exception i.e throw from here so that someone else can handle it
            //2 handle : try-catch
        }
        else{
            System.out.println("You can cast your vote");
        }
    }
}
//main -> Validate -> other
//ROse =>
//1. declare : flower + throw : throw /throws
