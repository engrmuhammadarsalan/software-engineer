class Calculator{


    public void add(int a, int b){
        System.out.println("Sum Of Two num: " + (a + b));
    }
    public void add(int a, int b , int c){
        System.out.println("Sum Of Three num: "+ (a + b + c));
    }


}

public class TwoOrThreeNums {

    public static void main (String[] args){

        Calculator c = new Calculator();
        c.add(5,5);
        c.add(5,5, 6);


    }
}
