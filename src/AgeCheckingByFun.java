import java.util.Scanner;

public class AgeCheckingByFun {

    public static boolean AgeCheck(int age){
        if (age >= 18){
            return true;
        }else {
            return false;
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        boolean check = AgeCheck(age);
        if (check){
            System.out.println("You Are Eligible To Vote");
        }else {
            System.out.println("You Are Note Eligible To Vote");
        }
    }
}
