package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
  public static void main(String[] args) {
    twoSumOptimal();
  }
  public static void twoSumOptimal() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array values: ");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter target value: ");
    int target = sc.nextInt();
    sc.close();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        if (map.containsKey(target - arr[i])) {
            System.out.println(i + " " + map.get(target - arr[i]));
        } else {
            map.put(arr[i], i);
          }
    }  
  }
}
