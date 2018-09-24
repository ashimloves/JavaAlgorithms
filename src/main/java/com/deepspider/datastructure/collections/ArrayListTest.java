package com.deepspider.datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {


    private static List<Integer> listIm = List.of(1,2,3,4,5,6);
    private static List<Integer> list = new ArrayList<>(listIm);

    public static void processAll(){

        //trying to modify immutable list
        try {
            listIm.add(7);
        } catch (Exception e){
            System.out.println("As listIm is immutable as it is initialized by List.of");
        }

        //looping through a list using enhanced for loop
        for (int a : list){
            System.out.println("Enhanced for loop Java 9+ : "+a);
        }

        //trying to modify and iterating through the same loop hence concurrent modification exception
        try {
            for (int a : list){
                list.remove((Integer) 2);
            }
        } catch (Exception e) {
            System.out.println("Not a good idea to modify List inside an enhanced for loop");
        }

        //using an iterator to loop through
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Using iterator : "+it.next());
        }


        try {
            list.remove(6);
        } catch (Exception e) {
            System.out.println("It failed as remove() excepts int as a parameter to treat is as index and this list has max 5");
            list.remove((Integer) 6);
            System.out.println("Now it worked as int is passed using Integer wrapper class as an object : "+ list);
        }

        list.add(7);

    }

}
