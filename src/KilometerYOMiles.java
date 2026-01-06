import java.util.Scanner;

public class KilometerYOMiles {

    public static double Miles(double miless , double kilometr){

        double sum = kilometr * miless;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int miless = sc.nextInt();
        double kilometr = 0.62137119;
        double summ = Miles(miless,kilometr);
        System.out.println("The Num " +miless+ "You had entered is " +summ  );
    }
}
