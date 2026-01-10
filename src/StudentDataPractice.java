import java.util.Scanner;

class StudentO{
    String name;
    int roll;

    StudentO(){
        System.out.println("Constructor called");
    }

    public void Data(String name){
        System.out.println( "Hello " + name + " welcome" );
        System.out.println( "Your Roll No is " +  roll + " good luck" );
    }

    public void Data(int roll){
        System.out.println( "Hello " + name + " welcome" );
        System.out.println( "Your Roll No is " +  roll + " good luck" );
    }

    public void Data(String name, int roll){
        System.out.println( "Hello " + name + " welcome" );
        System.out.println( "Your Roll No is " +  roll + " good luck" );
    }
}

public class StudentDataPractice {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        StudentO sca = new StudentO();
        System.out.println("Enter Your Last Name ");
        sca.name = sc.nextLine();
        System.out.println("Enter Your Roll No ");
        sca.roll = sc.nextInt();

        sca.Data(sca.roll);

    }
}

