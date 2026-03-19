package Encapsulation.Task08;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("Successfully Deposited!\n");
        } else {
            System.out.println("Invalid Balance Output, Balance set to 0.");
            this.balance = 0;
        }
    }

    public void withdraw(double balance){
        if (balance >= 0 && balance<=this.balance) {
            this.balance -= balance ;
            System.out.println("Successfully Withdraw!\n");
        } else {
            System.out.println("Invalid Withdraw Input, Withdraw set to 0.");
            this.balance -= 0;
        }
    }
}
