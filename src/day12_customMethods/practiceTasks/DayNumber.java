package day12_customMethods.practiceTasks;

public class DayNumber {

    public static void main(String[] args) {

        day(7);

    }

    public static void day(int number){

        String result = number==1? "Monday": number==2? "Tuesday": number==3? "Wednesday": number==4? "Thursday": number==5? "Friday": number==6? "Saturday": number==7? "Sunday": "Invalid Number";

        System.out.println(result);

    }
}
