package numbercrunching;

public class HappyNumber {
public static void main(String[] args){
    happyNumber(7348);
}
public static void happyNumber(int n) {
    int slow = n;
    int fast = n;
    do {
        slow = calculate(slow);
        fast = calculate(calculate(fast));
    } while (slow != fast && fast != 1);
    if (fast == 1) {
        System.out.println("Yes Happy Number");
        return;
    }
    System.out.println("Not a Happy Number");

}

public static int calculate(int n) {
    int sum = 0;
    while (n != 0) {
        int rem = n % 10;
        sum = sum + (rem * rem);
        n = n / 10;
    }
    return sum;
}
}
