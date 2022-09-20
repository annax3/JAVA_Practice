package Ja111_Sprint2.Day_9;

public class _1CmdLine {
    /*
    * Take the Command Line Argument and print the factorial of that number.
Case1-
If only one number is supplied then simply find the factorial of that number
Input5
Output120
Case2-
If two numbers are supplied then find the absolute difference of the two numbers and then find
the factorial of the resulting number.
Input5 8
Output6
Case 3-
If three or more numbers are suppliedInput5 6 8 9
OutputError*/
    public static void main(String[] args) {
        if (args.length>2){
            System.out.println("error");
        }
        int number;
        if(args.length==1){
            String num=args[0];
            number=Integer.parseInt(num);
        }
        if(args.length==2){
            String num1=args[0];
            String  num2=args[1];
            number=Math.abs(Integer.parseInt(num1)-Integer.parseInt(num2));
            //int number =Integer.parseInt(num1)+Integer.parseInt(num2);
        }
    }
    static int fact(int num){
        if(num==2||num==1) return num;
        else return num*fact(num-1);
    }
}
