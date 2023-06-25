package org.example.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class _part16NavigableSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        treeset.add(1000);
        treeset.add(2000);
        treeset.add(3000);
        treeset.add(4000);
        treeset.add(5000);
        System.out.println(treeset);
        System.out.println(treeset.ceiling(2000));//either 2000 or after 2000 return lowest element
        System.out.println(treeset.higher(2000));//after 2000 return highest
        System.out.println(treeset.floor(3000));//either 3000 or before 3000 return highest element
        System.out.println(treeset.lower(3000));//before 3000 return lowest element
        System.out.println(treeset.pollFirst());//remove and return first element
        System.out.println(treeset.pollLast());//remove and return last element
        System.out.println(treeset.descendingSet());
        System.out.println(treeset);

        System.out.println("****************************************************");
        TreeMap<String,String> treemap = new TreeMap<String,String>();
        treemap.put("b","banana");
        treemap.put("c","cat");
        treemap.put("a","apple");
        treemap.put("d","dog");
        treemap.put("g","gun");
        System.out.println(treemap);
        System.out.println(treemap.ceilingKey("c"));//either 2000 or after 2000 return lowest element
        System.out.println(treemap.higherKey("e"));//after 2000 return highest
        System.out.println(treemap.floorKey("e"));//either 3000 or before 3000 return highest element
        System.out.println(treemap.lowerKey("e"));//before 3000 return lowest element
        System.out.println(treemap.pollFirstEntry());//remove and return first element
        System.out.println(treemap.pollLastEntry());//remove and return last element
        System.out.println(treemap.descendingMap());
        System.out.println(treemap);



    }
}
