package arrays;
import java.util.Scanner;

public class MissingNumber{
  public static void main(String[] args){
    missingnumber();
  }
  public static void missingnumber() {

    // Given an array nums containing n distinct numbers in the range [0, n], return
    // the only number in the range that is missing from the array.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array values: ");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    sc.close();
    int missingVal = n;
    for (int i = 0; i < arr.length; i++) {
        missingVal ^= i ^ arr[i];
    }
    System.out.println(missingVal);
  }
}
