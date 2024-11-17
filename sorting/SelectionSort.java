// In selection sort we just find the minimum element in the array
// and swap it with the current element and we keep doing that till 
// we get teh sorted array

import java.util.Set;

/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 2, 1, 4 };
        sort(arr);
        printArray(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // assuming min index i
            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}