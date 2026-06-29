package practice.pb2;

public class Transaction {
    private double amount;
    private String blockChainHash = null;

    public Transaction(double amount){
        if(amount<0){
            throw new IllegalArgumentException("amount cant be negative.");
        }
        this.amount = amount;
    }

    public void setBlockChainHash(String blockChainHash) {
        if(this.blockChainHash!=null){
            throw new IllegalStateException("Hash is already set. Can be set only one time.");
        }
        this.blockChainHash = blockChainHash;
    }

    public double getAmount() {
        return amount;
    }

    public String getBlockChainHash() {
        return blockChainHash;
    }
}
