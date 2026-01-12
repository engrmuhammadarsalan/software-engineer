import java.util.Scanner;

class BankAccount3 {
    String accountNumber;
    int balance;

    BankAccount3(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

public class BankAccountImproveVersionWithConstructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount3 acc = new BankAccount3("AHK0682156", 20000);

        System.out.println("Enter amount to deposit:");
        int dep = sc.nextInt();
        acc.deposit(dep);

        System.out.println("Enter amount to withdraw:");
        int wd = sc.nextInt();
        acc.withdraw(wd);
    }
}
