import java.util.Scanner;

public class CheckingNum {

    public static boolean numberIsEvenOrNot(int n){
        if (n % 2 == 0){
            return true;
        }else {
            return false;
        }
    }


    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num You Want To check!");
        int n = sc.nextInt();

        boolean result = numberIsEvenOrNot(n);
        if (result){
            System.out.println("The number " + n + " is even number.");
        }else {
            System.out.println("The number " + n + " is odd number.");
        }


    }
}
