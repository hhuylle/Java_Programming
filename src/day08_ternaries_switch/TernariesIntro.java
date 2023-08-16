package day08_ternaries_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 70;

        String result = "";

        if (score >= 60){
            result = "Passed";
        }else{
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("----------------------------------");

        String result2 = score >= 60 ? "Passed" : "Failed";

        System.out.println(result2);

        System.out.println("----------------------------------");

        int age = 31;
        /*
        String result3;

        if (age >= 21){
            result3 = "Eligible";
        }else{
            result3 = "Not eligible";
        }
        System.out.println(result3);
        */
        String result3 = age >= 21 ? "Eligible" : "Not eligible";

        System.out.println(result3);

        System.out.println("----------------------------------");

    }
}
