package practice.pb2;

public  abstract class PaymentProcesser {
    private static double GLOBAL_DAILY_VOLUME = 0;
    private static final double MAX_DAILY_VOLUME =1000;

    public void processTimeline(Transaction tx){
        validateTransaction(tx);
        executeTransfer(tx);
        logToLedger(tx);
    }
    public void logToLedger(Transaction tx){
        System.out.println("[Ledger] Amount: $"+tx.getAmount()+" | Hash:"+tx.getBlockChainHash()+" | Daily Volume:"+getGlobalDailyVolume());
    }
    public abstract void executeTransfer(Transaction tx);
     private void validateTransaction(Transaction tx){
         if(GLOBAL_DAILY_VOLUME+tx.getAmount()>MAX_DAILY_VOLUME){
             throw new IllegalStateException("Daily limit exceeded.");
         }
     }

     public void addToDailyVolume(double amount){
         GLOBAL_DAILY_VOLUME+=amount;
     }
    public static double getGlobalDailyVolume() {
        return GLOBAL_DAILY_VOLUME;
    }

    public static double getMaxDailyVolume() {
        return MAX_DAILY_VOLUME;
    }
}
