package algorithms;

import java.util.Scanner;

class DuthNational {
public static void main(String[] args) {
    dutchNationalAlgorithm();
}  
public static void dutchNationalAlgorithm() {
    // Given an array containing only 0s, 1s, and 2s, implement the Dutch National
    // Flag algorithm to sort the array in-place. Write a function sortColors that
    // takes an integer array as input and modifies the array such that all 0s are
    // grouped at the beginning, followed by all 1s, and finally, all 2s at the end.
    // The function should run in O(n) time complexity.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    System.out.print("Enter array values: ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    sc.close();
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid <= high) {
        if (arr[mid] == 1) {
            mid++;
        } else if (arr[mid] == 0) {
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            mid++;
            low++;
        } else {
            int temp = arr[high];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
        }
    }
}
}