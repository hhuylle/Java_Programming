package day08_ternaries_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        /*
        char grade = 'B';

        String result = "";

        if (grade == 'A'){
            result = "excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        }else {
            result = "Failed";
        }
        System.out.println(result);
         */

        char grade = 'B';

        /*String result;

        if (grade == 'A'){
            result = "excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        }else {
            result = "Failed";
        }
        System.out.println(result);
*/
        System.out.println("--------------------------------------");

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
            // default doesn't need have break;

        }




    }
}
