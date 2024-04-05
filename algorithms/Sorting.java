package algorithms;

public class Sorting {
  public static void main(String[] args) {
    //int arr[] = {1,3,5,7,9,11,13};
    /*  int arr[] = {13,9,4,5,2,1}; */
    int arr[] = {34,23,3,78,45,2};
    // bubbleSort(arr);
   // selectionSort(arr);
     insertionSort(arr);
  }
  /*  select minimums and swap */
  public static void selectionSort(int arr[]) {
    System.out.print("Unsorted array: ");
    printArray(arr);
    int n = arr.length;
    for (int i = 0; i <= n- 2; i++) {
      int minPos = i;

      for (int j = i; j <= n - 1 ; j++) {
        if (arr[j] < arr[minPos]) {
          minPos = j;
        }
      }
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
    }
    System.out.print("Sorted array: ");
    printArray(arr);
  }  

  /*  push the max to last by adjacent swapping */
  public static void bubbleSort(int arr[]) {
    System.out.print("Unsorted array: ");
    printArray(arr);
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      /* int didSwap = 0; */
      for (int j = 0; j < n - 1 ; j++) {
        if(arr[j] > arr[j+1] ){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          /*  didSwap = 1 ; */
        }
      }
    }
    //   if(didSwap == 0 ){
    //     break;
    //   }
    //   System.out.println("runs");
    //   }
    System.out.print("Sorted array: ");
    printArray(arr);
}

/* takes an element and places in its correct order  */

public static void insertionSort(int arr[]) {
  System.out.print("Unsorted array : ");
  printArray(arr);
  int n = arr.length;
  for (int i = 0; i <= n - 1; i++) {
    int j = i;
    while (j > 0  && arr[j - 1] > arr[j]) {
      int temp = arr[j];
      arr[j] = arr[j - 1];
      arr[j - 1] = temp;
      j--;
    }
  }
  System.out.print("Sorted Array : ");
  printArray(arr);
}


public static void printArray(int arr[]) {
  for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
  }
  System.out.println();
}
}
