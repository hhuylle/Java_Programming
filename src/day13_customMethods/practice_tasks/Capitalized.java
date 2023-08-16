package day13_customMethods.practice_tasks;

public class Capitalized {

    public static void main(String[] args) {

        String titleName = "jAvA";

        System.out.println(title(titleName));
    }

    public static String title(String str){
        String title = str.substring(0,1).toUpperCase() + str.substring(1,4).toLowerCase();
        return title;
    }
}
