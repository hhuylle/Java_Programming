package day12_customMethods.practiceTasks;

public class EmailDomain {

    public static void main(String[] args) {

        emailDomain();

    }


    public static void emailDomain(){

        String email = "Cydeo@gmail.com";

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("domain = " + domain);

    }
}
