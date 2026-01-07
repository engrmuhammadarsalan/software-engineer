import java.util.Scanner;

public class FirstNNaturalNum {

    public static int sumOfNatural(int number){
        int sum =0;
        for (int i = number; i >= 1; i--) {
            sum+=i;
        }return sum;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Natural num till you want to add:");
        int number = sc.nextInt();


        System.out.println("The Sum of Natural Num Is: " +sumOfNatural(number) );
    }
}
