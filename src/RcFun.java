import java.util.Scanner;

public class RcFun {

    public static void Num(int n){
        if (n==0){
            return;
        }
        Num(n-1);
        System.out.println(n);
    }
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The values");
        int n = sc.nextInt();
        Num(n);
    }
}
