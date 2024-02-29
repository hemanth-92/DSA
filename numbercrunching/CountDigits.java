package numbercrunching;

import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args){
    countDigits();
  }
  public static void countDigits() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    sc.close();
    int count = 0;
    while (n > 0) {
        n = n / 10;
        count++;
      }
      System.out.println(count);
    }
}
