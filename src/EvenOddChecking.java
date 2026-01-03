import java.util.Scanner;

public class EvenOddChecking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter The Numbers");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even++;   // COUNT
            } else {
                odd++;    // COUNT
            }
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }
}
