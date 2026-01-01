import java.util.Scanner;

public class GreatestNumReturn {
    public static int greatestNumFrom (int a, int b) {
        if (a > b) {
            return a;
        }
        else{
                return b;
            }

        }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First value");
        int a = sc.nextInt();

        System.out.println("Enter The Second value");
        int b = sc.nextInt();

        int result = greatestNumFrom(a,b);
        System.out.println("The greatest num is: " + result );




    }


}
