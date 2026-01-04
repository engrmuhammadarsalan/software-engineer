import java.util.Scanner;

public class TwoDArrayprb2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want?");
        int rows = sc.nextInt();
        System.out.println("How Many Column You Want?");
        int column = sc.nextInt();

        int arr [][] = new int[rows][column];

        System.out.println("Enter the Values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                System.out.println(arr[i][j] + "");
                sum+=arr[i][j];
            }

            System.out.println("the totaL SUM = " + sum);

        }



    }
}




