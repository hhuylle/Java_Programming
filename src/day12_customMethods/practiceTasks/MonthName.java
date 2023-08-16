package day12_customMethods.practiceTasks;

public class MonthName {

    public static void main(String[] args) {

        monthName(15);

    }

    public static void monthName(int num){

        String monthName = num==1? "January": num==2? "February": num==3? "March": num==4? "April": num==5? "May": num==6? "June": num==7? "July": num==8? "August": num==9? "September": num==10? "October": num==11? "November": num==12? "December": "Invalid Number";

        System.out.println(monthName);
    }
}
