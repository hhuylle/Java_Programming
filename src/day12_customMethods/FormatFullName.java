package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = scan.nextLine().trim().replace(" ","");
        // add trim() & replace() methods of String to make sure that white spaces and additional spaces between the characters will be removed/omitted

        System.out.println("Enter your last name:");
        String last = scan.nextLine().trim().replace(" ","");

        scan.close();

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        System.out.println(fullName);





    }
}
