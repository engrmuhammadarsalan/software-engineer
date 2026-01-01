import java.util.*;

public class RadiusOfCircle {

    public static double returnCircumfarance (double r){
        double cal = 2 * Math.PI * r;
        return cal;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of radius");
        double r = sc.nextDouble();

        double cal = returnCircumfarance(r);
        System.out.println("The circumference of a circle is : " + cal );
    }
}
