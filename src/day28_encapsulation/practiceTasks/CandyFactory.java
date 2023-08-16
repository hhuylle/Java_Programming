package day28_encapsulation.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    /*
    Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
     */
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(new Candy("Hershey",5,2.99,false),
                                    new Candy("Snickers",8,3.59,true),
                                    new Candy("M&M's",20,2.59,true),
                                    new Candy("Reese's",6,4.59,true),
                                    new Candy("Starburst",10,1.99,false)));

        for (Candy each : candies) {
            System.out.println(each.getBrand() + " : " + each.getPrice());
        }

    }
}
