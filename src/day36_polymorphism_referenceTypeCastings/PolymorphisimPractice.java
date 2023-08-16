package day36_polymorphism_referenceTypeCastings;


import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class PolymorphisimPractice {


    public static void main(String[] args) {

        Phone[] phones = {
                new Phone("Apple","Iphone 11 Pro", "Large",900, "Black"),
                new Phone("Apple","Iphone 12 Pro Max", "Large",1200, "Black"),
                new Phone("Apple","Iphone 9", "Medium",800, "Gold"),
                new Samsung("Galaxy S19", "Medium",700, "Pink"),
                new Samsung("Galaxy S20", "Large",850, "Silver"),
                new Samsung("Galaxy S21", "Large",950, "Red"),
                new Nokia("XR20", "Small",350, "Black"),
                new Nokia("G10", "Medium",99, "Blue"),
                new Nokia("G50", "Large",250, "Silver"),
                new Phone("Apple","Iphone 12 Pro", "Large", 1200,"Black"),
                new Phone("Apple","Iphone 11 Pro Max", "Large",1100, "Silver"),
                new Samsung("Galaxy S18", "Medium",750, "White"),
                new Samsung("Galaxy S17", "Large",650, "Silver"),
                new Nokia("G10", "Medium", 99,"Black"),
                new Phone("Apple","Iphone 6", "Small",400, "Gold"),
                new Phone("Apple","Iphone 7", "Small", 500, "White")
        };

        Phone phone1 = new Samsung("Galaxy S19", "Medium",700, "Pink");
        Phone phone2 = new Phone("Apple","Iphone 11 Pro", "Large",900, "Black");

        System.out.println("------------------------------------------------------------------------");

        for (Phone each : phones) {
            System.out.println(each.getModel()+" - "+each.getColor()+" - "+each.getPrice());
        }

        int countIphone = 0,
                countSamsung = 0;
        for (Phone each : phones) {
            if (each instanceof Phone){
                countIphone++;
            }else{
                countSamsung++;
            }
        }
        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);

        for (Phone each : phones) {
            if ( each instanceof Phone || each instanceof Samsung){ // if the phone is Iphone or Samsung
                if (each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }


    }
}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphone in the array of phones?

	3. How many Samsung in the array of phones?

	4. Display the models of Iphone and samsung that has the price of 700 or greater
 */
