package WednesdayLiveSession.week10;

public class TestEncryptionObjects {

    public static void main(String[] args) {

        T2Encryption encryption1 = new T2Encryption("james bond");
        encryption1.modifyNum = 20;
        encryption1.factorNum = 2;
        encryption1.encrypt();
        System.out.println(encryption1);

        T2Encryption encryption2 = new T2Encryption("I make cookies with more sugar", 35, 3);
        System.out.println(encryption2);


        String secretMsg = "324 201 432 396 426 408 201 402 438 438 426 420 408 450 201 462 420 453 417 201 432 438 447 408 201 450 456 414 396 447";

        //Giving the wrong factor and modify numbers:
        System.out.println(T2Encryption.decrypt(secretMsg,20,2));

        //Giving the right factor and modify numbers:
        System.out.println(T2Encryption.decrypt(secretMsg,35,3));




    }
}
