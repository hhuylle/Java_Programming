package day08_ternaries_switch;

public class Elevator {

    public static void main(String[] args) {

        /*int floorNumber = 10;

        if (floorNumber >= 1 && floorNumber <= 3){
            if (floorNumber == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }


        }else {
            System.out.println("Invalid floor");

            // invalid floor
        }
*/
        // other wise we can write like this for pre-condition

            int floorNumber = 2;

            String result = "Invalid floor";

            if(floorNumber >=1 && floorNumber <= 3){

                result = "Floor "+floorNumber+" is selected. Company: ";

                if(floorNumber == 1){
                    result += "Lobby, Verizon, Starbucks";
                }else if(floorNumber == 2){
                    result += "Cydeo, NASA, Intersat";
                }else {
                    result += "Lyft, BofA, Stake House";
                }

            }

        System.out.println(result);






        
    }
}
