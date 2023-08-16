package day08_ternaries_switch._tasks;

public class Browser {

    public static void main(String[] args) {

        String browserName = "Safari";

        String result = "";

        switch (browserName){
            case "Chrome":
                result = "Chrome";
                break;
            case "Firefox":
                result = "Firefox";
                break;
            case "Opera":
                result = "Opera";
                break;
            case "Edge":
                result = "Edge";
                break;
            case "Safari":
                result = "Safari";
                break;
            default:
                result = "Invalid Browser";
        }

        System.out.println(result);




    }
}
