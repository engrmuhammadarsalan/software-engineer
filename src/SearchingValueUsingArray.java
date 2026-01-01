import java.util.Scanner;

public class SearchingValueUsingArray {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter The Size Of Array");
        int size = sc.nextInt();
        int [] num = new int[size];

        System.out.println("Please Enter The num");
        for (int i = 0; i < size; i++) {
            num [i]= sc.nextInt();
        }

        System.out.println("Enter the num you want to search");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (x == num[i]){
                System.out.println("The Given value " + x + " is found at position : " + i);
            }

        }
    }
}
