package day12_customMethods.practiceTasks;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(25,false);

    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if (age>=21 && isAmerican==true){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
}
