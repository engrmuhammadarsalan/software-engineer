import java.util.Scanner;

public class PositiveAndNegative {

    public static boolean positiveNum(int n){
        if (n>0){
            return true;

        }else {
            return false;
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number You Want To Check Is It Positive or Not");
        int n = sc.nextInt();
        Boolean res = positiveNum(n);

        if(res) {
            System.out.println("The Positive Num");
        }else {
            System.out.println("Negative Num");
        }
    }
}
