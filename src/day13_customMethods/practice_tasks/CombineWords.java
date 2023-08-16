package day13_customMethods.practice_tasks;

public class CombineWords {

    public static void main(String[] args) {

        String s = combineWords("one","eight");

        System.out.println(s);

    }

    public static String combineWords(String w1, String w2){

        String result = "";
        if (w1.charAt(w1.length()-1) == w2.charAt(0)){
            result = w1 + w2.substring(1);
        }else {
            result = w1 + w2;
        }
        return result;
    }
}
