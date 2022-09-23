package JAVA_111.Day_14;

import java.util.*;

public class _1Collection {
    public static void main(String[] args) {
        //initial capacity, size(variable)
        List<Integer> List = new ArrayList<>();//dynamic array
        List.add(10);
        List.add(11);
        List<Integer> anotherList = Arrays.asList(0,1,2,3,4,5);
        List.addAll(anotherList);
        System.out.println(List.contains(3));
        System.out.println(List.containsAll(anotherList));
        //List.removeAll(anotherList);
        Iterator<Integer> iterator=List.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
        //List L allow duplicates, allow null
        //ArrayList : internally it's an array : index  based access a[5] O(1)
        //DELETE/ inside  index 3 : index based access/read a[5] O(1)
        List<String> LinkedList= new LinkedList<>();//doubly LL
        //Object[] a=new Object[];

        //List va Set
        //allows dups, doesn't
        //index based access, doesn't have it
        List.get(0);
        Set<Integer>set = new HashSet<>();
        set.add(0);
        //set.get(0); //sets doesn't have index based access



    }
}
//collection: add(), remove()
//List,set,...
