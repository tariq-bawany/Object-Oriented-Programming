package Encapsulation.OmniPay_gateway_system;


public class Main {

    static void main(String[] args) {
        System.out.println("--- 🚀 OMNIPAY SYSTEM LIVE ---");

        // Part 3: Test Data Migrator
        PaymentAccount tariqAccount = new PaymentAccount("tariq mahmood, 5000.0");
        tariqAccount.activate();

        // Part 4: Test Overloaded Methods
        tariqAccount.processPayment(100.0);           // USD
        tariqAccount.processPayment(28000, "PKR");    // Converts 28000 to 100 USD
        tariqAccount.processPayment("PAY:50");        // Encoded

        // Part 5: Test Audit Summary
        System.out.println(tariqAccount.getAccountSummary());

        // Final Boss Logic Check
        var inactiveAccount = new PaymentAccount("Jane Doe", 10000.0);
//        inactiveAccount.activate();
        var winner = PaymentAccount.compareAccounts(tariqAccount, inactiveAccount);
        System.out.println("Active Priority Winner: \n" + winner.getAccountSummary());
    }
}
