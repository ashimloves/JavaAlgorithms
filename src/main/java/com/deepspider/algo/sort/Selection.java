package com.deepspider.algo.sort;

public class Selection {
    //takes array and elements to swap as parameter
    private static void swap(int[] arr, int i, int j){
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    //main method to sort an array, takes array as a parameter
    public int[] sort(int[] arr){
        //lastUnsortedIndex initialized with the index of last element in case of selection sort
        for (int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            //starts with largestIndex as 0 and as the array is traversed largestIndex is updated with value of index of the largest element
            int largestIndex = 0;
            //looping through the unsorted part of array
            for (int i = 1; i <= lastUnsortedIndex; i++){
                //checking which element is the largest and updating largestIndex
                if (arr[largestIndex] < arr[i]){
                    largestIndex = i;
                }
            }
            //swapping last unsorted element with largest element
            swap(arr, largestIndex, lastUnsortedIndex);
        }
        return arr;
    }
}
