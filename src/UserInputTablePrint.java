import java.util.Scanner;

public class UserInputTablePrint {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to print the table: ");
        int num = sc.nextInt();

        System.out.print("Enter the number you want to print the time table: ");
        int times = sc.nextInt();

        for (int i = 1; i <= times; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
