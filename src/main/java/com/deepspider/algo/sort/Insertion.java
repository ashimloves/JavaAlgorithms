package com.deepspider.algo.sort;

public class Insertion {

    //method to sort an array using insertion sort
    public int[] sort(int[] arr){
        //starts with assuming 1st element is sorted (as this partition is an array of one element and one element array is always sorted)
        //so firstUnsortedIndex starts with element 2, index 1
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            //storing first unsorted element to a variable
            int newElement = arr[firstUnsortedIndex];
            //initializing i outside of for to use the value later, to get the what should be the position of new element or first unsorted element
            int i;
            //starts with an index of first unsorted element's index, i < 0 as if it is zero then it is already sorted
            //and last element of sorted partition > newElement then only we can replace newElement with last element of sorted partition
            //and it goes on till i > 0
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            //got the value of i from the above loop and that is the position of first unsorted element or new element
            //after this loop increments the value of firstUnsortedIndex + 1
            arr[i] = newElement;
        }

        return arr;
    }


}
