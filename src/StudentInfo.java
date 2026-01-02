import javax.xml.transform.Source;
import java.util.Scanner;

class Student{
    String Name;
    int Roll_no;
    int marks;

    public void Result() {
        if (marks < 40) {
            System.out.println("You are Below Average Student");
        }
        else if (marks >= 40 && marks < 70)
        {
            System.out.println("Your Are Average Student");
        }
        else
        {
            System.out.println("Your Are A+ Student");
        }
    }

}

public class StudentInfo {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student();
        st1.Name = "Ali";

        System.out.println("Enter Your Marks");
        st1.marks = sc.nextInt();

        st1.Result();


    }
}
