import java.util.Scanner;

public class ArrayQuestions{
  public static void main(String[] args){
      // reverseArray();
      // rotateArrayRightByK();
      // rotateRightOptimal();
      rotateLeftOptimal();
  }
  public static void reverseArray(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter the array values: ");
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
  // brute force 
  public static void rotateArrayRightByK() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array values: ");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the value of k: ");
    int k = sc.nextInt();
    k = k % n;
    sc.close();
    System.out.print("Initial array: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    for (int i = 1; i <= k; i++) {
        int temp = arr[arr.length - 1];
        for (int j = n - 1; j >= 1; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = temp;
    }
    System.out.print("\nRotated array: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
  }
  // optimal method
  // rotate right array by k 
  public static void rotateRightOptimal(){
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
    System.out.print("Rotated array:");
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
  public static void rotateLeftOptimal(){
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
}