import java.util.Scanner;

public class StringAsArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("Names entered are:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
