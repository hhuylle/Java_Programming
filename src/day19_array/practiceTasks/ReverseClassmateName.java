package day19_array.practiceTasks;

import java.util.Arrays;

public class ReverseClassmateName {
    /*
    create string array, and store the names of your  class mate (10)
            reverse each student names and print them in separate line
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
     */
    public static void main(String[] args) {

        String[] names = {"Ergun ","Laila ","Orhun ","Andriy ","Nataliia ","Mehmet Han","Ibrokhim ","Adem ","Nagihan ","Huy "};

        for (int i = 0; i < names.length; i++) {
            String classmate = names[i];
            String reverse = "";

            for (int i1 = classmate.length() - 1; i1 >= 0; i1--) {
                reverse += classmate.charAt(i1);

            }
            System.out.println(reverse);
        }

    }
}
