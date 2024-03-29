package day06_ifStatements.day06_tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 35;

        String result = "";

        boolean infant = age >=1 && age <=2,
                toddler = age >= 3 && age <= 5,
                kid = age >=6 && age <= 9,
                preTeen = age >= 10 && age <= 12,
                teenager = age >= 13 && age <= 17,
                youngAdult = age >=18 && age <= 20,
                adult = age >= 21 && age <= 39,
                youngMiddleAgedAdult = age >= 40 && age <= 49,
                middleAgedAdult = age >= 50 && age <= 54,
                veryYoungSeniorCitizen = age >= 55 && age <= 64,
                youngSeniorCitizen = age >= 65 && age <= 74,
                seniorCitizen = age >= 75 && age <= 84,
                oldSeniorCitizen = age >= 85;

        if (infant){
            result = "Infant";
        }
        if (toddler){
            result = "Toddler";
        }
        if (kid){
            result = "Kid";
        }
        if (preTeen){
            result = "Pre-Teen";
        }
        if (teenager){
            result = "Teenager";
        }
        if (youngAdult){
            result = "Young Adult";
        }
        if (adult){
            result = "Adult";
        }
        if (youngMiddleAgedAdult){
            result = "Young Middle-Aged Adult";
        }
        if (middleAgedAdult){
            result = "Middle-Aged Adult";
        }
        if (veryYoungSeniorCitizen){
            result = "Very Young Senior Citizen";
        }
        if (youngSeniorCitizen){
            result = "Young Senior Citizen";
        }
        if (seniorCitizen){
            result = "Senior Citizen";
        }
        if (oldSeniorCitizen){
            result = "Old Senior Citizen";
        }

        System.out.println(result);

    }
}

    /*
        Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person:
	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
 */