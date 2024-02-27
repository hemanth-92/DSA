import java.util.Scanner;
public class ArrayQuestions{
  public static void main(String[] args){
      // reverseArray();
      // srotateRightOptimalByK();
      // rotateLeftOptimalByK();
      seconMinMax();
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

  // optimal method
  // rotate right array by k 
  public static void rotateRightOptimalByK(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the of the array :");
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
    reverse(arr,0,arr.length-k-1);
    reverse(arr,k+1,arr.length-1);
    reverse(arr,0,arr.length-1);
    System.out.print("\nRotated array:");
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
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
    System.out.print("Enter the of the array :");
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
    reverse(arr,0,arr.length-k-1);
    reverse(arr,k+1,arr.length-1);
    reverse(arr,0,arr.length-1);
    System.out.print("\nRotated array:");
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
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
    System.out.println("Second minimum: " + secondMax);
    System.out.println("Second minimum: " + secondMin);
  }
}