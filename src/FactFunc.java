import java.util.Scanner;

public class FactFunc {

    public static int factorialReturn(int num){

        int fact = 1;
        for (int i = 1; i < num ; i++) {
            fact*=i;
        }return fact;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number so that i can give its factorial");
        int num = sc.nextInt();

        System.out.println("The Factorial Of: " + num + " is " +factorialReturn(num));

    }
}
