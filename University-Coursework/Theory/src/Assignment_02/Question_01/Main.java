package Assignment_02.Question_01;

abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
    public void deposit(double amount) {
        balance +=amount;
    }

    public void printBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public void withdraw(double amount) {
        if (balance > amount)
            balance = balance - amount;
        else
            System.out.println("Insufficient funds");
    }
}

public class Main {
    public static void main(String args[]) {
        BankAccount acc = new SavingsAccount("Alice", 1000.0);
        acc.deposit(500);
        acc.withdraw(200);
        acc.printBalance();
    }
}
