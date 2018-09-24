package com.deepspider;

import com.deepspider.algo.sort.Bubble;
import com.deepspider.algo.sort.Insertion;
import com.deepspider.algo.sort.Selection;
import com.deepspider.datastructure.collections.ArrayListTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {7,80,15,-22,15,17,32};
        System.out.println("Sorting : "+ Arrays.toString(arr1));
        Bubble b = new Bubble();
        System.out.println("Bubble sort : "+ Arrays.toString(b.sort(arr1)));

        int[] arr2 = {7,80,15,-22,15,17,32};
        System.out.println("Sorting : "+ Arrays.toString(arr2));
        Selection s = new Selection();
        System.out.println("Selection sort : "+ Arrays.toString(s.sort(arr2)));

        int[] arr3 = {7,80,15,-22,15,17,32};
        System.out.println("Sorting : "+ Arrays.toString(arr3));
        Insertion i = new Insertion();
        System.out.println("Insertion sort : "+ Arrays.toString(i.sort(arr3)));


        ArrayListTest.processAll();
    }
}
