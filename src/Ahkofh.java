import java.util.Scanner;

public class Ahkofh {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of Array: ");
        int size = sc.nextInt();
        int [] arr = new int [size];

        System.out.println("Enter Values To store: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]< 0){
                System.out.println("Please Enter Only Positive Num");
            }
        }

        int Largest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > Largest){
                Largest = arr[i];
            }


        }

        System.out.println("largest Num is: " +Largest);

        int Second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > Second_largest && arr[i] < Largest){
                Second_largest = arr[i];
            }

        }
        System.out.println("Second largest Num is: " +Second_largest);

    }

}

