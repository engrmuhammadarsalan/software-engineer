import java.util.Scanner;
class Employe{
    String name;
    int salary;

    Employe(String name, int salary){
        this.name = name;
        this.salary=salary;
    }

    public void bonus(){
        if (salary<50000){
            System.out.println("You Will Get 20% Increment");
        }else {
            System.out.println("You Will Get 10% Increment");
        }
    }
}

public class EmployeeImproveVersion {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Current Salary");
        int salary = sc.nextInt();
        Employe em = new Employe(name,salary);
        em.bonus();
    }
}
