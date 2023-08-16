package day11_string;

public class StringMethod2 {

    public static void main(String[] args) {

        // replace() Method of string
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        System.out.println(sentence.replace("Python", "Java"));

        String word = "Java";

        //System.out.println(word.replace('a', 'e')); // Jeve
        System.out.println(word.replace("a", "e")); // Jeve

        //===========================

        String sentence2 = "I love Java, Java is cool";

        System.out.println(sentence2.replace("Java", "Python"));
        System.out.println(sentence2.replaceFirst("Java", "Python"));

        //-------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        System.out.println(sentence3.replaceFirst("Java", "Python"));
        System.out.println(sentence3.replaceFirst(", Java ", ", Python "));
        //System.out.println(sentence3.replaceFirst(", Java ", ", Python "));

        //=========================================================

        // substring() Method of string
        String str1 = "I love Java Programming";

        //System.out.println(str1.substring(7, 11));
        String languageName = str1.substring(7, 10+1);
        System.out.println(languageName);
        //-------------------------------
        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //  index           0123456789

        String today = sentence5.substring(9, 15);
        System.out.println(today);
        //-------------------------------
        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf('@')+1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain);
        //--------------------------------
        String sentence6 = "I love Java programming";

        String r1 = sentence6.substring(7);

        System.out.println(r1);

        //---------------------------------
        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' '));
        System.out.println(tomorrow);
        //----------------------------------
        String sentence8 = "I study at Cydeo School";

        //System.out.println(sentence8.substring(sentence8.lastIndexOf(" C")));
        String schoolName = sentence8.substring(11);

        System.out.println(schoolName);
        //=======================================================
        // repeat() method
         String str = "Python";

         String result = (str+"\n").repeat(10);
         //String result = (str+"\t").repeat(10);

        System.out.println(result);











    }
}
