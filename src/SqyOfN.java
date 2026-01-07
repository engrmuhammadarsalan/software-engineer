import java.util.Scanner;



public class SqyOfN {
    public static int sqrOfNum(int n){

        return n*n;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num");
        int n = sc.nextInt();

        int res = sqrOfNum(n) ;
        System.out.println(res);
    }
}
