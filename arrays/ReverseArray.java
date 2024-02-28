package arrays;
import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    reverseArray();
  }
  public static void reverseArray(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter the array values :");
    for(int i = 0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    System.out.print("Intial array : ");
    for(int i =0; i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    //  reversing the array
    int start = 0;
    int end = arr.length-1;
    // swapping elememts
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      // increment start and decrement end 
      start ++;
      end --;
    }
    System.out.print("\nReversed array :");
    for(int i =0 ;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}

