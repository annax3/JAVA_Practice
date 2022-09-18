package Ja111_Sprint2.Day_7;

import java.util.Scanner;

public class _4MaxItemInArray {
    public static void main(String[] args) {

        System.out.println("Enter the size array Items");
        Scanner  sc=new Scanner(System.in);

        int size= sc.nextInt();
        int []arr= new int[size];
        for (int j=0;j<size;j++){
             arr[j]= sc.nextInt();
        }
        System.out.println("Max :"+getMax(arr));
    }
    static int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        if(array.length==0){
            System.out.println("array is empty");
        }
        else {
            for (int i=0;i<array.length;i++){
                if(max<array[i]){
                    max=array[i];
                }
            }
        }
        return max;
    }

}
