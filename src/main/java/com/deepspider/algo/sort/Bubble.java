package com.deepspider.algo.sort;

public class Bubble {

    //takes array and elements to swap as parameter
    private static void swap(int[] arr, int i, int j){
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //method to sorting an array using bubble sort
    public int[] sort(int[] arr) {
        //starts with unsortedIndex = index of last element as the array is assumed to be unsorted
        for (int unsortedIndex = arr.length -1; unsortedIndex > 0; unsortedIndex--) {
            //2nd loop to check if left element is greater than right most element, if yes then swap
            //end of this loop will result in the last unsorted index to be sorted desc
            for (int i = 0; i < unsortedIndex; i++) {
                if ((arr[i] > arr[i + 1])) {
                    swap(arr, i, i+1);
                }
            }
        }

        return arr;
    }

}
