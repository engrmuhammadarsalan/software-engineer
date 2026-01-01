import java.util.Scanner;

public class AverageOf3Num {

    public static int averageOfThreeNumber (int a,int b,int c){
        int sum = a+b+c;
        int complete = sum/3;
        return complete;
    }
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num");
        int a = sc.nextInt();

        System.out.println("Enter the Second num");
        int b = sc.nextInt();

        System.out.println("Enter the Last num");
        int c = sc.nextInt();

        int complete = averageOfThreeNumber(a,b,c);

        System.out.println("The Average of three Num are" + complete);
    }
}
