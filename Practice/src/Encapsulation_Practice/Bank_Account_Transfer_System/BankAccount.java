package Encapsulation_Practice.Bank_Account_Transfer_System;

public class BankAccount {
    private String accountHolder;
    private double balance =0;
    private String accountNumber;

    public BankAccount(String accountHolder,double balance, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber =accountNumber;
        if(balance>0) this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public boolean withdraw(double amount){
        if(amount>0 && amount<=this.balance){
            this.balance-=amount;
            System.out.println("Withdraw Successful.");
            return true;
        }else{
            System.out.println("Invalid Withdraw Input.");
            return false;
        }
    }
    public void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println("Amount Deposited Successfully.");
        }else{
            System.out.println("Invalid Deposit Input.");
        }
    }
    public void transfer(BankAccount target, double amount){
        if(withdraw(amount)){
            target.balance+=amount;
            System.out.println("Amount transferred Successfully.");
        }else{
            System.out.println("Transferred failed, Try again.");
        }
    }
}
