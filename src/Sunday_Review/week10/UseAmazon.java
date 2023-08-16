package Sunday_Review.week10;

public class UseAmazon {
    /*
    Create a class UseAmazon
    create an object of the AmazonAccount and verify the constructor, getters and setters and toString are working properly
     */
    public static void main(String[] args) {

        AmazonAccount account1 = new AmazonAccount("javaiscool","java4life@gmail.com",false);

        //account1.email; --> cannot access because it is private

       account1.setEmail("hhuylle@gmail.com");

        System.out.println(account1.getEmail());


    }
}
