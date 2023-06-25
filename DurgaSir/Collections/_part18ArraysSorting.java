package org.example.collections;

import java.util.Arrays;
import java.util.Comparator;

public class _part18ArraysSorting {
    public static void main(String[] args) {
        int[] a1 = {10,5,20,11,6};
        System.out.println("Primitive Array before sorting :");
        for (int a:
             a1) {
            System.out.println(a);
        }// we use for each loop to print element of array

        Arrays.sort(a1);
        System.out.println("Primitive Array After sorting :");
        for (int a:
             a1) {
            System.out.println(a);
        }

        String[] s1 = {"A","Z","B"};
        System.out.println("Object Array before sorting :");
        for (String s:
                s1) {
            System.out.println(s);
        }// we use for each loop to print element of array

        Arrays.sort(s1);
        System.out.println("Primitive Array After sorting :");
        for (String s:
                s1) {
            System.out.println(s);
        }

        Arrays.sort(s1,new MyComparator());
        System.out.println("Object Array After sorting By Using Comparator :");
        for (String s: s1){
            System.out.println(s);
        }

    }
}
class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1);
    }
}
