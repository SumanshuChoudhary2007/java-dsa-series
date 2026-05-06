package Java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    static void main(String[] args) {
        //list or collection -> interfaces

        ArrayList<Integer> list = new ArrayList<>();

//        List<Integer> list=new ArrayList<>();
//        Collection<Integer> list=new ArrayList<>();

        //add element at last
        list.add(10); //[10]
        list.add(20); //[10,20]
        list.add(30); //[10,20,30]

        System.out.println(list);

        list.add(40); //[10,20,30,40]

        System.out.println(list);

        list.remove(0);// remove element at ind 0 (i.e. 10) [20, 30, 40]

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(200); //[200]
        list2.add(500); //[200, 500]
        list2.add(1999); //[200,500,1999]
        list.addAll(list2); //[20, 30, 40, 200, 500, 1999]

        System.out.println(list2);

        System.out.println(list);

        list.removeAll(list2); //[20, 30, 40]

        System.out.println(list);

        System.out.println(list.size()); //size of list i.e. 3

        System.out.println("element in list2: " + list2);

        list2.clear(); //remove all the element from list2

        System.out.println(list2); //[]

        // i want to iterate list using iterator
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("element: " + iterator.next());
        }

        System.out.println(list.get(0)); //return element at particular ind

        list.set(0, 100); // replace the existing element at particular ind can't create new element only replace

        System.out.println(list.get(0));

        Object[] arr = list.toArray();// converted to type array

        System.out.println(arr.getClass());
        System.out.println("after converted to array: " + arr);

        System.out.println(list.contains(150));//false because list doesn't contain 150
        list.add(2);
        list.add(20);
        list.add(15);
        System.out.println("before sorting: " + list);
        //  Collections.sort(list);// sort in increasing order
        list.sort(Collections.reverseOrder());// new way to sort in java 8

        System.out.println("After sorting inc order: " + list);
        //  Collections.sort(list,Collectons.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.println("After sorting desc order: " + list);
    }

}
