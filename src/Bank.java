import java.util.Scanner;

class BankAccount {
    String accountNumber;
    int balance;

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();
        acc.accountNumber = "PKTW3903891267";
        acc.balance = 50000;

        System.out.println("Enter amount to deposit:");
        int dep = sc.nextInt();
        acc.deposit(dep);

        System.out.println("Enter amount to withdraw:");
        int wit = sc.nextInt();
        acc.withdraw(wit);
    }
}
