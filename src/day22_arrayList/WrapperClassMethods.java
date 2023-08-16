package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1);
        // 201

        //Integer num1 = Integer.parseInt(str); // Unboxing
        int num1 = Integer.parseInt(str);

        System.out.println(num1+1);
        // 21

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);
        // 20
        System.out.println("-----------------------------------------");

        String s = "20.5";

        Double num3 = Double.valueOf(s);
        double num4 = Double.parseDouble(s);

        System.out.println(num3+0.5); // 21
        System.out.println(num4+1.5); // 22

        System.out.println("------------------------------");

        String x = "true";

        Boolean tf = Boolean.valueOf(x);
        boolean tf1 = Boolean.parseBoolean(x);

        System.out.println(tf);
        System.out.println(tf1);

        System.out.println("------------------------------");

        char ch = '%';

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCase = Character.isLowerCase(ch);
        boolean isUpperCase = Character.isUpperCase(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);// special character

        System.out.println("isDigit = "+ isDigit);
        System.out.println("isLetter = "+ isLetter);
        System.out.println("isLowerCase = " + isLowerCase);
        System.out.println("isUpperCase = " + isUpperCase);
        System.out.println("isSpecialCharacter = " + isSpecialChar);

        System.out.println("-----------------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;
        String letters = "";
        for (char each : string.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
            if (Character.isLetter(each)){
                letters += String.valueOf(each);
            }
        }

        System.out.println("sum = " + sum);//output: 15
        System.out.println("letters = " + letters);//output: abcde



    }
}
