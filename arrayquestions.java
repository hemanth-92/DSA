//kdanes algorithm
public class kadanes{
  public static int kadanesAlgorithm(int[] a){
      int currentSum=0;
      int maxSum=Integer.MIN_VALUE;
      for(int i =0; i<a.length;i++){
        currentSum+=a[i];
        maxSum=Math.max(maxSum,currentSum);
          if(currentSum<=0){
              currentSum=0;
          }
      }
  return maxSum;
  }
  public static void main(String ...args){
      int[] a={-2,-3,4,-1,-2,1,5,-3};
      int maxSum=kadanesAlgorithm(a);
      System.out.println(maxSum);
  }
}

public class revers