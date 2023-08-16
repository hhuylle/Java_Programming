package Sunday_Review.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class CountChar {
    /*
    CountChar [ArrayList, String, loop]

	Create a program that defines an ArrayList of Strings and a char letter. Find how many times the given char letter is found in the words defined in the ArrayList

		Ex:
		Input:
			"java", "html", "css", "java", "javascript", "selenium"
			letter: ‘a’
		Output:
			6
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        System.out.println(countCharInList(list,'a'));
        /*
        int count = 0;
        for (String each : list) {
            for (char eachLetter : each.toCharArray()) {
                if (eachLetter=='a'){
                    count++;
                }
            }
        }
        System.out.println(count);
         */
    }

    public static int countCharInList(ArrayList<String> list,char letter){
        int count = 0;
        for (String eachElement : list) {
            for(char eachLetter: eachElement.toCharArray()){
                if (eachLetter == letter){
                    count++;
                }
            }
        }
        return count;
    }
}
