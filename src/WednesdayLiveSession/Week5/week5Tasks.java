package WednesdayLiveSession.Week5;

import java.util.Scanner;

public class week5Tasks {

    public static void main(String[] args) {
        /*
        Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false
	ex:
		goodday --> false
		agoodmovie --> true
		nogoodtoday -> true
		notgoodfornow -> false
         */
        String str = "agoodday";

        String firstStart = str.substring(1);
        String secondStart = str.substring(2);

        if (firstStart.startsWith("good") || secondStart.startsWith("good")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //System.out.println(str1.startsWith("good") || str2.startsWith("good"));
        System.out.println("-----------------------");

        int index = str.indexOf("good");
        System.out.println(index == 1 || index == 2);
        System.out.println("-------------------------------------------------------");

        /*
        Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same
	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false
         */
        String str3 = "educated";
        String begin = str3.substring(0,2).toLowerCase();
        String end = str3.substring(str3.length()-2).toLowerCase();
        System.out.println(begin.equals(end));

        System.out.println("-------------------------");

        System.out.println(str3.endsWith(begin));

        System.out.println("-----------------------------------------------------------");

        /*
    T3SearchResults [String, dynamic index]
	Create a program that will have a String in a fixed format showing the results of a search. Based on that given format find the total number of search results and print them.
	Note: make the program as dynamic as possible for different sizes(it could be a number of 10 which is only 2 number digits or 100000 which is 6 number digits)
	Fixed format of the String:
		Total results found: $results. Sort, Filter, Ratings
	ex:
		"Total results found:3012. Sort, Filter, Ratings"
		-> 3012
		"Total results found:25. Sort, Filter, Ratings"
		-> 25
	Q: what is the datatype of the number we are getting in the end?
		Follow up, we will learn how to get this as an integer number in the future
     */

        String str4 = "Total results found:3012. Sort, Filter, Ratings";

        int indexStart = str4.indexOf(':')+1; // add 1 cuz the number starts from the next index.
        int indexEnd = str4.indexOf('.'); // the substring will exclude this index
        System.out.println(str4.substring(indexStart,indexEnd));

        //String indexNum = str4.substring(str4.indexOf(':')+1,str4.indexOf('.'));
        //System.out.println(indexNum);

        //System.out.println(str4.substring(str4.indexOf(':')+1, str4.indexOf('.')));

        // abcdefg---> indexOf(a) ---> 0 cuz  that is the first occurrence of the character 'a'

        System.out.println("------------------------------------------------------------");
          /*
    T4Reverse [String, index]
	Create a program that will have a String that is always 5 characters long. Reverse that given String and print the reverse version
	ex:
		input: hello
		output: olleh
		input: javaa
		output: aavaj
     */
        String str5 = "cydeo";

        String reverse =""+str5.charAt(4)+str5.charAt(3)+str5.charAt(2)+str5.charAt(1)+str5.charAt(0); // add "" to make charAt method becomes String method.
        System.out.println(reverse);

        System.out.println("-------------------------");

        int index1 = str5.length()-1; // index 4
        String reverse2 = ""+str5.charAt(index1--)+str5.charAt(index1--)+str5.charAt(index1--)+str5.charAt(index1--)+str5.charAt(index1--); // add -- to decrease the index of the String is given like index 4 --> 3 --> 2 --> 1 --> 0
        System.out.println(reverse2); // use this way for dynamic index

        System.out.println("------------------------------------------------");
        /*
    T5Angles [Scanner, conditional]
	Create a program that will ask the user to enter 3 angles. Add to sum of the angles and print what type of shape is made from the angles.
		If the angles add up to 180 print triangle.
		If the angles add up to 360 print circle
		For any other angle print: Cannot determine
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 angles:");
        int angle1 = scan.nextInt();
        int angle2 = scan.nextInt();
        int angle3 = scan.nextInt();

        int sum = angle1+angle2+angle3;

        if (sum == 180){
            System.out.println("Triangle");
        } else if (sum == 360) {
            System.out.println("Circle");
        }else {
            System.err.println("Not Determined");
        }

        System.out.println("-----------------------------------------------");







    }
}
