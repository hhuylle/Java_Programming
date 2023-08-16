package day06_ifStatements.day06_tasks;

public class characterIdentity {
    public static void main(String[] args) {


        char ch = '@';

        String result = "";

        boolean alphabetics = (ch >= 'A' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
        boolean digits = (ch >= '0') && (ch <= '9');
        boolean specialCharacters = !alphabetics && !digits;

        if ( digits ){
            result = "digit";
        }

        if (specialCharacters){
            result = "Special Character";
        }

        if (alphabetics){
            result = " Alphabetic";
        }

        System.out.println(result);


    }
}
/*
Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */
