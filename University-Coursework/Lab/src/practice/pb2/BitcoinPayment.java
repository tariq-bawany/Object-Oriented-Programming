package practice.pb2;

public class BitcoinPayment extends PaymentProcesser{



    @Override
    public void executeTransfer(Transaction tx) {
        addToDailyVolume(tx.getAmount());
        String Hash = "BTC-"+System.currentTimeMillis();
        tx.setBlockChainHash(Hash);

    }
}
