package day07_ifStatements.day07_tasks;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "Venti";
        String result = "Invalid size";
        double price = 0.0;
        int calories = 0;

        if(size == "Tall" || size == "Grande" || size == "Venti") {

            if (size == "Tall") {
                price = 3.69;
                calories = 90;
            } else if (size == "Grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }

            System.out.println("Price is: $" + price + "\n" + calories + " calories");

        }
    }
}
