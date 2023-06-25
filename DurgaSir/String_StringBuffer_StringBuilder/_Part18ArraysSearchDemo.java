package org.example.collections;

import java.util.Arrays;

public class _Part18ArraysSearchDemo {
    public static void main(String[] args) {
        int[] a={10,5,20,11,6};
        Arrays.sort(a);
        System.out.println("Sorted Array : ");
        for(int a1:a) {
            System.out.print(a1+" ");
        }
        System.out.println();
        System.out.println("Position of 6 : " +Arrays.binarySearch( a,6));
        System.out.println("Position of 14 : " +Arrays.binarySearch( a,14));
        System.out.println("Position of 7 : " +Arrays.binarySearch( a,7));

        String[] s={"A","Z","B"};
        Arrays.sort(s);
        System.out.println("Sorted Array : ");
        for(String s1:s) {
            System.out.print(s1+" ");
        }
        System.out.println();
        System.out.println("Position of Z : " +Arrays.binarySearch( s,"Z"));
        System.out.println("Position of S : " +Arrays.binarySearch( s,"S"));
        System.out.println("Position of P : " +Arrays.binarySearch( s,"P"));
    }
}
