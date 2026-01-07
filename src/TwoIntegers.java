import java.util.Scanner;

public class TwoIntegers {

    public static int checkingIntegers(int a , int b){
        if (a>b){
            return a;
        }else if (a == b){
            return a;
        }else {
            return b;
        }

    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Digit");
        int a = sc.nextInt();
        System.out.println("Enter the Second Digit");
        int b = sc.nextInt();

        int res = checkingIntegers(a,b);
        if ( a>b ){
            System.out.println(+ a + " Is Greater then " + b );
        }else if (a==b){
            System.out.println(" Both are Equal ");

        }else {

            System.out.println(+ b + " Is Greater then " + a );
        }

    }
}
