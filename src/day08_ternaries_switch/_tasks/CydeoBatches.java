package day08_ternaries_switch._tasks;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchTypes = "US Morning";

        String result = "";

        switch (batchTypes){

            case "US Morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;

            case "US Evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;

            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;

            default:
                System.out.println("Invalid Batch");

        }
        System.out.println(result);






    }
}
