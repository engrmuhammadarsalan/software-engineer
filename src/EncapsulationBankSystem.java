import java.util.Scanner;
class Bank03{
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Your Amount Successfuly deposit");
        System.out.println("Your New Balance is: "+ balance);
    }

    public void withDraw(int amount){

        if(amount>balance){
            System.out.println("Invalid Balance");
        }else {
            balance -= amount;
            System.out.println("Collect Your Money Please");
            System.out.println("Your New Balance is: "+ balance);
        }
    }



}

public class EncapsulationBankSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank03 b03 = new Bank03();
        b03.setBalance(30000);

        System.out.println("Enter the amount You want to deposite: ");
        int dep = sc.nextInt();
        b03.deposit(dep);

        System.out.println("Enter the amount you Want to withdraw: ");
        int wd = sc.nextInt();
        b03.withDraw(wd);




    }
}
