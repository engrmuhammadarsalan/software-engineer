import java.util.Scanner;

class Workers{
    String name;
    int salary;

    public void Bonus(){
        if (salary <= 50000){
            System.out.println("You Will Get 20% increment on this year");
        }
        else {
            System.out.println("You Will Get 10% increment on this year");

        }
    }
}

public class Employee {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        Workers ey = new Workers();
        ey.name = "Ahad";

        System.out.println("Enter Your Salary");
        ey.salary = sc.nextInt();

        ey.Bonus();
    }


}
