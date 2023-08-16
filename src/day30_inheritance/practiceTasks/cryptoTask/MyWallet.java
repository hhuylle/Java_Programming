package day30_inheritance.practiceTasks.cryptoTask;

public class MyWallet {

    public static void main(String[] args) {

        CryptoToken cryptoToken1 = new CryptoToken(0.09274,5000, 1288966085,834613741,1389924563,false);

        cryptoToken1.totalPrice();

        System.out.println(cryptoToken1);
    }
}
