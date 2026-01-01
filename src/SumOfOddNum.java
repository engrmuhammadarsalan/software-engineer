import java.util.Scanner;

public class SumOfOddNum {

    public static int sumOfOddNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = sumOfOddNumbers(n);
        System.out.println("The sum of all odd numbers is: " + result);
    }
}
