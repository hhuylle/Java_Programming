package day07_ifStatements.day07_tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 21;

        String result = "";


        if (age > 0 && age < 150) {

            if (age >= 21 ){
                result = "Teenager";
            } else if (age < 55) {
                result = "Adult";
            }else {
                result = "Senior";
            }

        }else {
            result = "Invalid";
        }

        System.out.println(result);



    }
}
