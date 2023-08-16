package Sunday_Review.week7;

public class ReverseMiddle {
    /*
    ReverseMiddle [array, String, loop]
	Create a program that will have a String consisting of three words. Print the String, but the middle word should be reversed
	Ex:
		input: more java please
		ouput: more avaj please
     */

    public static void main(String[] args) {

        String str = "more java please";
        String[] eachWord = str.split(" ");

        //System.out.println(Arrays.toString(eachWord));
        // [more, java, please]
        //System.out.println(Arrays.toString(eachWord).replace(",","").replace("[","").replace("]",""));
        // more java please

        String reverse = "";
        for (int i = eachWord[1].length()-1; i >= 0; i--) {
            reverse += eachWord[1].charAt(i); // eachWord[1] is always the middle word, so we are doing charAt(i) reads the characters of the middle word backwords
        }
        System.out.println(eachWord[0]+" "+reverse+" "+eachWord[2]);
        // more avaj please


    }
}
