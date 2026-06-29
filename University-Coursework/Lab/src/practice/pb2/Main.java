package practice.pb2;

public class Main {
    public static void main(String[] args) {
    PaymentProcesser eth = new EthereumPayment();
    PaymentProcesser btc = new BitcoinPayment();

    eth.processTimeline(new Transaction(200));
    btc.processTimeline(new Transaction(700));

    }
}
