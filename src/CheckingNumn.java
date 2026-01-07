import java.util.Scanner;

public class CheckingNumn {

    public static boolean checkNum(int a){

        if ( a % 5 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num You Want to divide");
        int a = sc.nextInt();

        boolean res = checkNum(a);
        if (res){
            System.out.println("Is Divisible");
        }else {
            System.out.println("not Divisible");
        }


    }
}
