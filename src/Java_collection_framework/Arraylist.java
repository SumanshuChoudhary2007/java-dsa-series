package Java_collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args){
        //list or collection -> interfaces

        ArrayList<Integer> list= new ArrayList<>();

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

        System.out.println("element in list2: "+list2);

        list2.clear(); //remove all the element from list2

        System.out.println(list2); //[]

        // i want to iterate list using iterator
        Iterator<Integer> iterator= list.iterator();

        while(iterator.hasNext()){
            System.out.println("element: "+ iterator.next());
        }

        System.out.println(list.get(0)); //return element at particular ind

        list.set(0,100); // replace the existing element at particular ind can't create new element only replace

        System.out.println(list.get(0));

        Object[] arr=list.toArray();// converted to type array

        System.out.println(arr.getClass());// give the 
    }
}
