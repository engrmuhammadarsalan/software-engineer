public class StudentPercenteage {

    public static int calculatePercen(int a, int b , int c , int d , int e){
       int sum = a+b+c+d+e;
       int percent = sum/5;
       return percent;


    }

    public static void main (String[] args){
        System.out.println("Welcome To Your Personal Calculator");
        int sum = calculatePercen(6, 9 , 2 , 6, 0);
        System.out.println(sum);
    }
}
