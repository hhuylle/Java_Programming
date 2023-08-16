package day30_inheritance.practiceTasks.cryptoTask;

public class XRP extends CryptoToken{

    public XRP(double price, int quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
