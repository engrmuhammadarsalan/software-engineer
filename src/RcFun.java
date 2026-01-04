public class RcFun {

    public static void Num(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        Num(n-1);
    }





    public static void main (String[] args){
        int n = 5;
        Num(n);
    }
}
