import java.util.Scanner;



public class adding {
    public static int addi(int a, int b , int c ){

        int sum = a+b+c;
        return (sum);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a");
         int a = sc.nextInt();
        System.out.println("Enter the Value of b");
         int b = sc.nextInt();
        System.out.println("Enter the Value of c");
         int c = sc.nextInt();

         int sum = addi(a,b,c);
        System.out.println("The Sum of given num are"+sum);
    }
}
