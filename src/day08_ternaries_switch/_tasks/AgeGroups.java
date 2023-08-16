package day08_ternaries_switch._tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 50;

        String result = "";


        String ageGroups = (age>=0 && age<=150)? (age<=2)? "Infant": (age<=5)? "Toddler": (age<=9)? "Kid": (age<=12)? "Pre-Teen": (age<=17)? "Teenager": (age<=20)? "Young Adult": (age<=39)? "Adult": (age<=49)? "Young Middle-Aged Adult": (age<=54)? "Middle-Aged Adult": (age<=64)? "Very Young senior Citizen": (age<=74)? "Young Senior Citizen": (age<=84)? "Senior Citizen": "Old Senior Citizen": "Invalid";

        System.out.println(ageGroups);




    }
}
