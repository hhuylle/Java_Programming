package day11_string;

public class StringMethod3 {

    public static void main(String[] args) {

        // isEmpty() method

        String word = "";
        boolean r1 = word.isEmpty();
        System.out.println(r1);

        //===============================================
        // isBlank() method

        String str = "           ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //===============================================
        // equals(str) method

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));

        //=================================================
        //equalsIgnoreCase(str) method

        String s1 ="JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //==================================================
        // contains(str) method

        String students = "Hasan Naran Sumeye Natalie";
        boolean hasAhmed = students.contains("Admed");
        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);

        //====================================================
        // startsWith(str) & endsWith() method

        String name = "Michael";
        boolean n = name.startsWith("el");
        System.out.println("n = " + n);

        String url = "www.cydeo.com";
        boolean u = url.startsWith("www.");
        System.out.println("u = " + u);

        boolean u2 = url.endsWith(".com");
        System.out.println("u2 = " + u2);

        //------------------------------------

        String email = "CydeoSchool@hotmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotMail = email.endsWith("hotmail.com");
        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);








    }
}
