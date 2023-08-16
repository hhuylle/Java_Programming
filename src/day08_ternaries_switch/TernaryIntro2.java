package day08_ternaries_switch;

public class TernaryIntro2 {

    public static void main(String[] args) {

        int number = 0;
        /*
        String result = "";
        if (number > 0){
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        }else {
            result = "Zero";
        }
        */

        String result = (number > 0) ? "Positive": (number < 0)? "Negative": "Zero";

        System.out.println(result);

        System.out.println("----------------------------------");

        int n = 7;

        /*
        String day = "";

        if (n == 1){
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
        } else if (n == 5) {
            day = "Friday";
        } else if (n == 6) {
            day = "Sartuday";
        } else {
            day = "Sunday";
        }
        */

        String day = n==1 ? "Monday": n==2 ? "Tuesday": n==3 ? "Wednesday": n==4 ? "Thursday": n==5 ? "Friday": n==6 ? "Saturday": "Sunday";

        System.out.println(day);

        System.out.println("----------------------------------");

        int t = 6;

        String month = t==1? "January": t==2? "February": t==3? "March": t==4? "April": t==5? "May": t==6? "June": t==7? "July": t==8? "August": t==9? "September": t==10? "October": t==11? "November": "December";

        System.out.println(month);




    }
}
