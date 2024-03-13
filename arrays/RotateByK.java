package arrays;

import java.util.Scanner;

public class RotateByK {
  public static void main(String[] args) {
    // rotateRightOptimalByK();
    rotateLeftOptimalByK();
  }
  // optimal method
  // rotate right array by k 
  public static void rotateRightOptimalByK(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter the values in array :");
    for(int i =0 ;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print("Enter the value of k :");
    int k = sc.nextInt();
    k = k % n;
    sc.close();
    System.out.print("Enter the intial array:");
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    reverse(arr, 0, arr.length - k - 1);
    reverse(arr, k + 1, arr.length - 1);
    reverse(arr, 0, arr.length - 1);
    System.out.print("\nRotated array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  public static void reverse(int[] arr,int start,int end){
    while(start<=end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
}
  // optimal method
  // rotate left array by k 
  public static void rotateLeftOptimalByK(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter the values in array :");
    for(int i =0 ;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print("Enter the value of k :");
    int k = sc.nextInt();
    k = k % n;
    sc.close();
    System.out.print("Enter the intial array:");
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);
    reverse(arr, 0, arr.length - 1);
    System.out.print("\nRotated array:");
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}
