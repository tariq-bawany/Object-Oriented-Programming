package Encapsulation.OmniPay_gateway_system;

import java.util.Random;

public class PaymentAccount {
    // ---------------------------------------------------------
    // PART 1: THE SECURE FOUNDATION (Private Fields)
    // ---------------------------------------------------------
    private String accountID;
    private String accountHolder;
    private double balance;
    private String accountStatus;

    public void activate() { this.accountStatus = "ACTIVE"; }

    @SuppressWarnings("unused")
    public void deactivate() { this.accountStatus = "INACTIVE"; }

    @SuppressWarnings("unused")
    public void deposit(double amount) {
        // Safe Deposit logic
        if (amount > 0) this.balance += amount;
    }
    // ------------------- END OF PART 1 -----------------------


    // ---------------------------------------------------------
    // PART 2: THE "SMART" IDENTITY (String Manipulation)
    // ---------------------------------------------------------
    public void setAccountID(String id) {
        // ID Validation logic: OP-XXXX-2026
        if (id != null && id.startsWith("OP-") && id.endsWith("-2026") && id.length() == 12) {
            this.accountID = id;
        } else {
            this.accountID = "PENDING";
        }
    }

    public void setAccountHolder(String name) {
        if (name == null || name.isEmpty()) {
            this.accountHolder = "Unknown";
            return;
        }
        // Auto-Formatting: Trim and Title Case
        String[] words = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                        .append(w.substring(1).toLowerCase()).append(" ");
            }
        }
        this.accountHolder = sb.toString().trim();
    }
    // ------------------- END OF PART 2 -----------------------


    // ---------------------------------------------------------
    // PART 3: FLEXIBLE ONBOARDING (Constructor Chaining)
    // ---------------------------------------------------------

    // Basic & Data Migrator (Combined to avoid "Already Defined" error)
    public PaymentAccount(String inputData) {
        if (inputData.contains(",")) {
            // Data Migrator Logic: Parses "Name, Amount"
            String[] parts = inputData.split(",");
            setAccountHolder(parts[0]);
            this.balance = Double.parseDouble(parts[1].trim());
        } else {
            // Basic Logic: Name only
            setAccountHolder(inputData);
            this.balance = 0.0;
        }
        this.accountStatus = "INACTIVE";
        this.accountID = generateRandomID();
    }

    // Standard Constructor
    public PaymentAccount(String accountHolder, double initialDeposit) {
        setAccountHolder(accountHolder);
        this.balance = Math.max(0, initialDeposit);
        this.accountStatus = "INACTIVE";
        this.accountID = generateRandomID();
    }
    // ------------------- END OF PART 3 -----------------------


    // ---------------------------------------------------------
    // PART 4: MULTI-CURRENCY PROCESSOR (Method Overloading)
    // ---------------------------------------------------------

    // Overload 1: Standard (USD)
    public void processPayment(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    // Overload 2: Currency Shift (PKR / EUR)
    public void processPayment(double amount, String currencyCode) {
        double convertedAmount = amount;
        if ("PKR".equalsIgnoreCase(currencyCode)) {
            convertedAmount = amount / 280;
        } else if ("EUR".equalsIgnoreCase(currencyCode)) {
            convertedAmount = amount * 1.1;
        }
        processPayment(convertedAmount); // Internal call to Overload 1
    }

    // Overload 3: Encoded String
    public void processPayment(String encryptedEntry) {
        String[] parts = encryptedEntry.split(":");
        if (parts.length == 2 && "PAY".equals(parts[0])) {
            processPayment(Double.parseDouble(parts[1]));
        }
    }
    // ------------------- END OF PART 4 -----------------------


    // ---------------------------------------------------------
    // PART 5: SECURITY AUDIT & ANALYTICS
    // ---------------------------------------------------------
    public String getAccountSummary() {
        // Masking logic using String.repeat()
        String[] names = accountHolder.split(" ");
        StringBuilder masked = new StringBuilder();

        for (String n : names) {
            if (n.length() > 1) {
                masked.append(n.charAt(0))
                        .append("*".repeat(n.length() - 1))
                        .append(" ");
            } else {
                masked.append(n).append(" ");
            }
        }
        return "ID: " + accountID + " | Holder: " + masked.toString().trim() +
                " | Balance: $" + String.format("%.2f", balance) + " | Status: " + accountStatus;
    }

    public static PaymentAccount compareAccounts(PaymentAccount a, PaymentAccount b) {
        boolean aActive = "ACTIVE".equals(a.accountStatus);
        boolean bActive = "ACTIVE".equals(b.accountStatus);

        if (aActive && bActive) return (a.balance >= b.balance) ? a : b;
        if (aActive) return a;
        if (bActive) return b;
        return null;
    }

    private String generateRandomID() {
        return "OP-" + (new Random().nextInt(9000) + 1000) + "-2026";
    }
    // ------------------- END OF PART 5 -----------------------
}