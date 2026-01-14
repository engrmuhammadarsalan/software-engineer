import java.util.Scanner;

public class LargestNum {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int a = sc.nextInt();

        int arr [] = new int[a];

        System.out.println("Enter the values");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();

        }

        int larg = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larg){
                larg = arr[i];
            }

        }
        System.out.println("The larget num is  "+larg );






    }
}
