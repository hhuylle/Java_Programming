package day30_inheritance.practiceTasks.cryptoTask;

public class CryptoToken {
    /*
    cryptoTask
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can not set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)
*/
    private double price;
    private int quantity;
    private long marketCap, volume, circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, int quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Price can not be zero or negative: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            System.err.println("Quantity can not be negative: "+quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        if (marketCap<0){
            System.err.println("Market cap can not be zero: "+marketCap);
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price*quantity;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable= " + isMineable +
                ", totalPrice= $" + totalPrice() +
                '}';
    }

    /*
	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

     */
}
