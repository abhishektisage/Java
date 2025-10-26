import java.util.*;

public class MergeSortStrings {

    // Function to print an array of strings
    public static void printArr(String arr[]) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // Merge Sort function
    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return; // base case: single element
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);      // sort left half
        mergeSort(arr, mid + 1, ei);  // sort right half

        merge(arr, si, mid, ei);      // merge two halves
    }

    // Merge function
    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;       // pointer for left half
        int j = mid + 1;  // pointer for right half
        int k = 0;        // pointer for temp array

        // Compare strings and merge
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main function to test
    public static void main(String args[]) {
        String arr[] = {"banana", "apple", "mango", "grape", "orange"};
        System.out.println("Original array:");
        printArr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArr(arr);
    }
}
