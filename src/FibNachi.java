import java.util.Scanner;

public class FibNachi {

    public static void fibNachi(int a , int b , int n){
        if (n == 0 ){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibNachi(b,c,n-1);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter The Number for Fibonachi Series");
        int n = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        fibNachi(a,b,n-2);
    }
}
