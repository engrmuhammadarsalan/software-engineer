import java.util.Scanner;

public class SmallCalculator {
    public static void main(String[] args) {
        System.out.println("Enter The Number you want to chack");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Value : " );
        int a = sc.nextInt();
        System.out.println("Enter The Second Value : " );
        int b = sc.nextInt();
        System.out.println("Enter The Operation You Want To perform (+,-,*,/,%) : " );
        char op = sc.next().charAt(0);

        switch (op){
            case '+' :
                System.out.println("The Sum of Two Num are :" + (a+ b) );
                break;
            case '-' :
//                button = a - b;
                System.out.println("The Subtract of Two Num are :" + (a-b) );
                break;
            case '*' :
//                button = a * b;
                System.out.println("The Multiplication Value Of Two Num are :" + (a*b) );
                break;
            case '/' :
//                button = a / b;
                System.out.println("The Divide Value Of Two Num are :" + (a/b) );
                break;
            case '%' :
//                button = a % b;
                System.out.println("The Modolue Value Of Two Num are :" + (a%b) );
                break;
            default:
                System.out.println("Invalid Button");

        }

    }
}
