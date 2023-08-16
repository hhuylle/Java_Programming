package day07_ifStatements.day07_tasks;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int people = 50;

        String result = "Any other number of people on the ship is invalid";


        if (people >= 50 && people <= 100){

            if (people == 50){
                result = "Total: "+people+" ====> 20 crew, 30 passengers";
            } else if (people == 75) {
                result = "Total: "+people+" ====> 25 crew, 50 passengers";
            } else  {
                result = "Total: "+people+" ====> 30 crew, 70 passengers";
            }

        }

        System.out.println(result);


    }
}
