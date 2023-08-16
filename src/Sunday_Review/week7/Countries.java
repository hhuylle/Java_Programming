package Sunday_Review.week7;

import java.util.Arrays;

public class Countries {

    public static void main(String[] args) {

        String[] countries = {"Brazil","China","Cuba","Sweden","France","Vietnam","Albania","Portugal","Philippines","Armenia","Colombia","Honduras","Indonesia","United States"};

        // Find and print all the first and last characters:

        for (String country : countries) {
            System.out.println(country.charAt(0)+" "+country.charAt(country.length()-1));
        }

        System.out.println("-----------------------------------------------");
        // Find the largest and smallest countries based on the length of their names

        String smallest = countries[0];
        String largest = countries[0];

        for (String each : countries) {
            if (each.length() < smallest.length()){
                smallest = each;
            }
            if (each.length() > largest.length()){
                largest = each;
            }
        }
        System.out.println("Smallest = " + smallest);
        // Smallest = Cuba
        System.out.println("Largest = " + largest);
        // Largest = United States

        System.out.println("-----------------------------------------------");
        // Show all the countries that start with a 'C':

        String hasC = "";
        for (int i = 0; i < countries.length; i++) { // this loop iterates the array
            if (countries[i].startsWith("C")){
                hasC += countries[i]+", ";
            }
        }
        System.out.println(hasC);
        // China Cuba Colombia

        String[] hasCArr = hasC.split(", ");
        System.out.println(Arrays.toString(hasCArr));
        // [China, Cuba, Colombia]

        // Difference between length and length():
        // Length: information for an array, how many elements there is
        // Length():

        System.out.println("-----------------------------------------------");

        // Show all the countries that end with an 's':

        String hasS = "";
        for (String each : countries) {
            if (each.endsWith("s")){
                hasS += each+", ";
            }
        }

        System.out.println(hasS);
        // Philippines, Honduras, United States,

        String[] endArr = hasS.split(", ");
        System.out.println(Arrays.toString(endArr));
        // [Philippines, Honduras, United States]

        System.out.println("-----------------------------------------------");
        // Show the countries names in alphabet order:

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
        // [Albania, Armenia, Brazil, China, Colombia, Cuba, France, Honduras, Indonesia, Philippines, Portugal, Sweden, United States, Vietnam]







    }
}
