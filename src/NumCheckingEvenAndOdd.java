import java.util.Scanner;

public class NumCheckingEvenAndOdd {
    public static void main (String[] args){
        System.out.println("Enter The Number you want to chack");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if ( b % 2 == 0)
        {
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
}
