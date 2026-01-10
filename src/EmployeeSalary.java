import java.util.Scanner;
class Employeee{
    String name;
    int salary;

    public void isHighSalary(){

        if (salary <= 50000){
            System.out.println( "Hello " + name + " Your Salary is " + salary + " which is low");
        }else {
            System.out.println( "Hello " + name + " Your Salary is " + salary + " which is high");
        }
    }
}


public class EmployeeSalary {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Employeee emp = new Employeee();
        System.out.println("Enter Your Name Please");
        emp.name = sc.nextLine();
        System.out.println("Enter Your Salary Please");
        emp.salary = sc.nextInt();

        emp.isHighSalary();

    }
}
