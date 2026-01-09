import java.util.Scanner;

class StudentOf{
    String name;
    String roll;

    public void Data(){
        System.out.println( "Hello " + this.name + " welcome" );
        System.out.println( "Your Roll No is " +  this.roll + " good luck" );
    }
}

public class StuntData {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        StudentOf sca = new StudentOf();
        System.out.println("Enter Your Last Name ");
        sca.name = sc.nextLine();
        System.out.println("Enter Your Roll No ");
        sca.roll = sc.nextLine();

        sca.Data();

    }
}
