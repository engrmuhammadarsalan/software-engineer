import java.util.Scanner;

public class ProblemSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size Of Array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter The Numbers");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < size; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
