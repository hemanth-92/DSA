package algorithms;
import java.util.Scanner;

public class Kadanes {
  public static int kadanesAlgorithm(int[] arr) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
      currSum+=arr[i];
    }
    maxSum = Math.max(currSum,maxSum);
    if(currSum<maxSum){
      currSum =0;
  }
  return maxSum;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the size of array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter the intial array :");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int maxSum=kadanesAlgorithm(arr);
    System.out.println(maxSum);
}
}
