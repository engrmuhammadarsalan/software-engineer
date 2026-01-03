import java.util.Scanner;

public class ArraysSingle {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size Of Array");
        int size =sc.nextInt() ;

        int[] newS = new int [size];

        System.out.println("Enter The Numbres");
        for (int i = 0; i < size; i++) {
            newS[i] = sc.nextInt();
        }

        System.out.println("The Number You Had Entered are");
        for (int i = 0; i < size; i++) {
            System.out.print(newS[i]);

        }
    }
}
