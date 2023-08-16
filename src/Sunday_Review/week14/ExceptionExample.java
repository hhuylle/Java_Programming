package Sunday_Review.week14;

public class ExceptionExample {

    public static void main(String[] args) throws InterruptedException{

        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("String can not be null");
        }

        System.out.println("---------------------------------------------");

            System.out.println("Hello");
            Thread.sleep(3000);
            System.out.println("World");

        System.out.println("---------------------------------------------");

        String str2 = "java";
        System.out.println(str2.charAt(200));




    }
}
