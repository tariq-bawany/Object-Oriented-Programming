package Encapsulation.Task02;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public void deposit(double balance){
        if(balance>=0){
            this.balance = balance;
        }else{
            System.out.println("Invalid amount , only accepts positive amount.");
        }
    }
    public void withdraw(double balance){
        if(balance<=this.balance && balance>=0){
            this.balance -= balance;
        }else{
            System.out.println("Invalid withdraw amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountHolder(String name){
        this.accountHolder = name;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
}
