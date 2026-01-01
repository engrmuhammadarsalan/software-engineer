import java.util.Scanner;

public class Userrinput {
    public static void main (String[] args){
        System.out.println("Enter The Numbers You Want to Add");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("The Sum Of numbers are: " +sum);
    }

}
