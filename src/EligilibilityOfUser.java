import java.util.Scanner;

public class EligilibilityOfUser {

    public static boolean isEligible(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        boolean eligible = isEligible(age);

        if (eligible) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
