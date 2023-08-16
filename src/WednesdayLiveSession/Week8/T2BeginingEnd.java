package WednesdayLiveSession.Week8;

import java.util.Arrays;

public class T2BeginingEnd {
    /*
    T2BeginningEnd [array, loop, String]

    Create a program that will define a String array with some name values. Determine how many of the names begin with and end with the same character.

    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}

        -> 5

    Bonus challenge: Collect all the names that start and end with the same character into an array
     */
    public static void main(String[] args) {

        String[] names = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};

        String same = "";

        for (String each : names) {
            if (each.endsWith(each.substring(0,1).toLowerCase())){
                same += each+" ";
            }
        }

        if (same.isEmpty()){
            System.out.println("No names found");
            return;
        }

        String[] sameArr = same.split(" ");

        System.out.println(sameArr.length);
        // 5
        System.out.println(Arrays.toString(sameArr));
        // [Anna, Aliya, Hannah, Nathan, Otto]



    }
}
