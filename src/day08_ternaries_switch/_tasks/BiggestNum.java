package day08_ternaries_switch._tasks;

public class BiggestNum {

    public static void main(String[] args) {

        int n1 = 50,
            n2 = 32,
            n3 = 100;

        boolean n1IsBiggest = n1>n2 && n1>n3,
                n2IsBiggest = n2>n1 && n2>n3,
                n3IsBiggest = !n1IsBiggest && !n2IsBiggest;


        String result = n1IsBiggest || n2IsBiggest || n3IsBiggest? n1IsBiggest? "n1 is biggest": n2IsBiggest? "n2 is biggest": "n3 is biggest": "Invalid";

        System.out.println(result);


    }
}
