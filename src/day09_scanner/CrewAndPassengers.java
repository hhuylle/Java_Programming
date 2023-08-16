package day09_scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int num = 75;

        String result1 = (num==50 || num==75 || num==100)?
                        (num==50)? "20 crew, 30 passengers"
                        :(num==75)? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"
                        : "Invalid";

        System.out.println(result1);
        System.out.println("--------------------------------");
        String result2 = "";
        switch (num){
            case 50:
                result2 = "20 crew, 30 passengers";
                break;
            case 75:
                result2 = "25 crew, 50 passengers";
                break;
            case 100:
                result2 = "30 crew, 70 passengers";
                break;
            default:
                result2 = "Invaled";
        }

        System.out.println(result2);


    }
}
