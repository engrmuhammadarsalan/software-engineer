import java.util.Scanner;


class Pens{
    String name;
    String type;
    String color;

    public void showDetails(){
        System.out.println("Hello " + this.name + "You are wrting with " + this.type + " whose color is" + this.color);
    }
}

public class PenModify {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Pens p1 = new Pens();
        System.out.println("Enter Your Name");
        p1.name = sc.nextLine();
        p1.type = "Ballpen";
        p1.color = "black";

        p1.showDetails();
    }
}
