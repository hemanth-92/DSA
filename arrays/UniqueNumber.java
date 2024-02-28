package arrays;

import java.util.Scanner;

public class UniqueNumber {
  public static void main(String[] args) {
    uniqueElement();
  }
  public static int uniqueElement() {
        // Problem:
        // Given an array of integers nums representing a sequence, where each element
        // appears twice except for one element which appears only once, find and return
        // the unique element.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }

}
