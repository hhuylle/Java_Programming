package WednesdayLiveSession.Week5;

public class T1Army {
    /*
    T1Army [methods, conditional]
    Create a method that will determine if you are eligible to join the army. It will be a void method that accepts 3 parameters: age, has a high school diploma, and is a citizen
    to be eligible to join you must be between the age of 18-35, have a diploma, and must be a citizen
        if you are eligible print: You are qualified to join the Army
        if you are not eligible print all the reasons why you cannot join
            (it can be any combination of conditions, even all of them could not be met)
     */

    public static void main(String[] args) {

        eligibleForArmy(30, false, false);

    }

    public static void eligibleForArmy(int age, boolean hasDiploma, boolean isCitizen){

        if ( (age >=18 && age <= 35) && hasDiploma && isCitizen){
            System.out.println("You are qualified to join the Army"); // valid data
        }else { // invalid data
            System.out.println("You are NOT qualified to join the Army");

            if ( age < 18 ){
                System.out.println(age + " is less than our minimum age");
            } else if ( age > 35 ) {
                System.out.println(age + " is more than our maximum age");
            }

            if (!hasDiploma){
                System.out.println("You must have a high school diploma");
            }

            if (!isCitizen){
                System.out.println("You must be citizen");
            }


        }//end of the else

    }//method ends

}
