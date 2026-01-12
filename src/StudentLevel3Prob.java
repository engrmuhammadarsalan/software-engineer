class Student001{
    String name;
    int roll;

    Student001(String name, int roll){
        this.name = name;
        this.roll = roll;
    }


    public void info(){
        System.out.println("Hello " + name);
        System.out.println("Your Roll No: "+ roll);
    }

}

public class StudentLevel3Prob {

    public static void main (String[] args){
        Student001 s1 = new Student001("ali",15);
        s1.info();


    }
}
