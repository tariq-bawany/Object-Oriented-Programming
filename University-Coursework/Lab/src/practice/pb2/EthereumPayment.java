package practice.pb2;

public class EthereumPayment extends PaymentProcesser{



    @Override
    public void executeTransfer(Transaction tx) {
        addToDailyVolume(tx.getAmount());
        String Hash = "ETH-"+System.currentTimeMillis();
        tx.setBlockChainHash(Hash);

    }
}
