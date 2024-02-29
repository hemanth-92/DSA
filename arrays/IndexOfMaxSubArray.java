package arrays;

import java.util.Scanner;

public class IndexOfMaxSubArray {
public static void main(String[] args) {
    indexOfMaximumSumOfSubarray();
}
public static void indexOfMaximumSumOfSubarray() {
    int maxSum = 0;
    int currentSum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array values: ");
    for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
      }
    sc.close();

    int startIndex = 0;
    int endIndex = 0;
    int tempIndex = 0;

    for (int i = 0; i < arr.length; i++) {
      currentSum += arr[i];
      if (currentSum < 0) {
        currentSum = 0;
        tempIndex = i;
      }
      if (currentSum > maxSum) {
      maxSum = currentSum;
      startIndex = tempIndex;
      endIndex = i;
    }
  }
    System.out.println("Start index: " + startIndex);
    System.out.println("End index: " + endIndex);
    System.out.println(maxSum);
    }
}
