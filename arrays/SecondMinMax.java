package arrays;

import java.util.Scanner;

public class SecondMinMax {
  public static void main(String[] args){
    seconMinMax();
  }
  // second MIn And mAx
  public static void seconMinMax(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter the array values :");
    for(int i = 0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int maximum = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    for(int i = 0; i<arr.length;i++){
        if (arr[i] > maximum) {
          secondMax = maximum;
          maximum = arr[i];
      } else if (arr[i] != maximum && arr[i] > secondMax) {
          secondMax = arr[i];
      }
      if (arr[i] < minimum) {
          secondMin = minimum;
          minimum = arr[i];
      } else if (arr[i] != minimum && arr[i] < secondMin) {
          secondMin = arr[i];
      }
  }
    System.out.println("First maximum: " + maximum);
    System.out.println("First minimum: " + minimum);
    System.out.println("Second maximum: " + secondMax);
    System.out.println("Second minimum: " + secondMin);
  }
}
