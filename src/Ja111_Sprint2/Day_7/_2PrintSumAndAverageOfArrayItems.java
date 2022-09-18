package Ja111_Sprint2.Day_7;

import java.util.Scanner;

public class _2PrintSumAndAverageOfArrayItems {
    public static void main(String[] args) {
        //1 to 10
        //should print avg and sum
        Integer [] arr=new Integer[10];
        int k=1;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
             arr[i]=sc.nextInt();

        }
        for (int j = 0; j < arr.length; j++) {
            sum+=arr[j];
        }
        System.out.println("SUM :"+ sum);
        System.out.println("average :"+(double)sum/arr.length);
    }
}
/*
*#You Problem :4
* Write a non-static method inside class main
* Which will take an initialized integer array and return the largest number from the supplied array
* call this method from the main method of main class by supplying an initialized integer array
* and print the return result.
*
*
* int fun(int a){
* }
*
*
* int fun (int[] a){
* }
* int [] array = new int[9];
* fun(array);
 */