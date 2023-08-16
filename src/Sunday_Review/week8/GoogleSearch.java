package Sunday_Review.week8;

import java.util.Arrays;

public class GoogleSearch {
    /*
    GoogleSearch [Wrapper class, String, testing/automation idea]

	Create a program that will define a String that is given in a fixed format based on how google search results are displayed.

	format: About 3,940,000,000 results (0.39 seconds)

	Scenario: check if your search results are under 100 Million
		if the results are under print: Good Search
		if the results are over print: Narrow your search, too many results

	AC: User should be able to search in google and get results back in under 0.85 seconds or less
	Test Case:
		Given user opens the browser and navigates to google.com
		Then searches for {data}
		Verify if the time is less than or equal to 0.85 seconds

			> check the number of seconds it took for the results to see if the functionality is working properly
     */
    public static void main(String[] args) {

        String result = "About 42,100,000 results (0.39 seconds)";

        String[] eachPart = result.split(" ");

        System.out.println(Arrays.toString(eachPart));
        //output: [About, 3,940,000,000, results, (0.39, seconds)]
        System.out.println(eachPart[1]);
        //output: 3,940,000,000
        long resultNum = Long.parseLong(eachPart[1].replace(",",""));

        if ( resultNum < 100_000_000){
            System.out.println("Google Search");
        }else {
            System.out.println("Narrow your search, too many results"+resultNum);
        }

        System.out.println(eachPart[3]);

        double resultSecond = Double.parseDouble(eachPart[3].replace("(",""));//substring(1)

        if (resultSecond <= 0.85){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        //System.out.println(resultSecond<=0.85? "Passed": "Failed");




    }
}
