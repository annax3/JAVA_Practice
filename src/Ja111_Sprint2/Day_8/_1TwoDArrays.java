package Ja111_Sprint2.Day_8;

import java.util.Scanner;

public class _1TwoDArrays {
    public static void main(String[] args) {
        //int[] a=new int[5];
        int row =3;
        int columns=4;
        int [][] matrix=new int[row][columns];
        for (int i=0;i<row;i++){
            for (int j=0;j<columns;j++){
                Scanner sc=new Scanner(System.in);
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }

        }
    }
}
