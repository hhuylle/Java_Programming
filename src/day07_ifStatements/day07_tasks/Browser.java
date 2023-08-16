package day07_ifStatements.day07_tasks;

public class Browser {

    public static void main(String[] args) {

        String browserName = "Safari";

        String result = "";

        if (browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera" || browserName == "Safari" || browserName == "Edge") {
            if (browserName == "Chrome") {
                result = "Chrome browser is selected";
            } else if (browserName == "Firefox") {
                result = "Firefox browser is selected";
            } else if (browserName == "Opera") {
                result = "Opera browser is selected";
            } else if (browserName == "Safari") {
                result = "Safari browser is selected";
            } else {
                result = "Edge browser is selected";
            }

        } else {
            result = "Invalid Browser Name";
        }

        System.out.println(result);
    }
}
