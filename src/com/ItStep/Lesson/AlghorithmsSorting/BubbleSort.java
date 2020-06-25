package com.ItStep.Lesson.AlghorithmsSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {860, 8, 200, 9, 350, 120};
        System.out.println("---Array BEFORE Bubble Sort---");
        printArray(arr);
        bubbleSort(arr);//sorting array elements using bubble sort
        System.out.println("---Array AFTER Bubble Sort---");
        printArray(arr);
        System.out.println("Before Insertion Sort");
        printArray(arr);
        insertionSort(arr);//sorting array using insertion sort
        System.out.println("After Insertion Sort");
        printArray(arr);
    }

    //    The first we create a method: bubbleSort,
//    that takes the array as the input to be sorted: int[] array,
//    and the length of the array: n.
    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
//        The second step we create an outer for loop,
//        which will iterate over each element of the array.
        for (int i = 0; i < n; i++) {
            System.out.println("Sort Pass Number " + (i + 1));
//            The third step is to create an inner for loop.
//            This for loop starts from the first element of the array
//            till the second last index, (n - i).
//            Each time one index less than the last is traversed as at the end of each iteration,
//            the largest element for that iteration reaches the end.
            for (int j = 1; j < (n - i); j++) {
                System.out.println("Comparing " + array[j - 1] + " and " + array[j]);

//                Within the nested: for loop, is the: if condition.
              if(array[j -1]>array[j]){

//                This checks that if the element on the left is greater than that on the right.
//                If so, it swaps the two elements.
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println(array[j] + " is greater than " + array[j - 1]);
                    System.out.println("Swapping Elements: New Array After Swap");
                    printArray(array);
                }

            }
        }

    }

    static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            System.out.println("Sort Pass Number " + (i));
            int key = array[i];
            int j = i - 1;

            while ((j > -1) && (array[j] > key)) {
                System.out.println("Comparing " + key + " and " + array[j]);
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(array);
        }

    }

     static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}



