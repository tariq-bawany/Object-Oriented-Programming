package Encapsulation.OmniPay_gateway_system;

import java.util.*;

public class PaymentAccount {
    private String accountID;
    private String accountHolder;
    private double balance;
    private String accountStatus;

    //    Setting account status using activate and deactivate method and setAccountStatus method
    public void activate() {
        setAccountStatus(true);
    }

    public void deactivate() {
        setAccountStatus(false);
    }

    void setAccountStatus(boolean accountStatus) {
        if (accountStatus) this.accountStatus = "ACTIVE";
        else this.accountStatus = "INACTIVE";
    }

    // depositing balance method
    public void deposit(double balance) {
        if (balance > 0) this.balance += balance;
        else System.out.println("Invalid Balance Input");
    }

    // setting account holder and auto formatting the account holder with capitalizing first letter of each words
    public void setAccountHolder(String accountHolder) {
        // creates a array by splitting the string from spaces .split("\\s+")
        // .trim removes extra spaces (leading, trailing)
        String[] ac = accountHolder.trim().split("\\s+");
        // String Builder is used to concatenate a elements from array into a single String
        StringBuilder sb = new StringBuilder();
        // loop for capitalizing the first word
        for (int i = 0; i < ac.length; i++) {
            // substring extracts the part of String from staring index to ending index
            ac[i] = ac[i].substring(0, 1).toUpperCase() + ac[i].substring(1);
            // sb.append appends the array elements to the StringBuilder
            sb.append(ac[i]);
            // if it is not the last element it will add space between elements in a string
            if (i != ac.length - 1) sb.append(" ");
        }
        // new string is stored in account Holder
        accountHolder = sb.toString();
        System.out.println("Hello, " + accountHolder);
    }

    // setting ACCOUNT ID after checking conditions
    public void setAccountID(String accountID) {
        if (accountID.startsWith("OP-") && accountID.endsWith("-2026") && accountID.length() == 12) {
            this.accountID = accountID;

        }else {
            this.accountID = "PENDING";
            System.out.println("Your account ID is in invalid format and its status is "+this.accountID);
        }
    }
}
