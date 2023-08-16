package day30_inheritance.practiceTasks.cryptoTask;

public class Cardano extends CryptoToken{

    public Cardano(double price, int quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
