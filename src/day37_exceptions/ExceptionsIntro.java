package day37_exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) {


        String str = "Java";
        System.out.println(str);

        // char ch = str.charAt(100); // unchecked exception
        // System.out.println(ch);

        Pizza pizza = null;
        // pizza.calcCost(); // unchecked exception

        System.out.println(50 / 0); // unchecked exception

        System.out.println("Hello Morning");

        System.out.println("---------------------------------------------");
        // This is a BUG
        int score = 100;

        if (score > 59) {
            System.out.println("Grade is D");
        } else if (score > 70) { // to fix the bug is "score >= 70"
            System.out.println("Grade is C");
        }
        System.out.println("---------------------------------------------");

        // FileInputStream file = new FileInputStream(""); // Checked exception

       // Thread.sleep(3000); // checked exception

    }
}
