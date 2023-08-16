package day15_whileLoop;

public class RemoveDuplicate2 {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i))){ // if the character is already contained in new String
                continue; // skips it
            }
            result += str.charAt(i);
        }
        System.out.print(result);

        System.out.println("------------------------------------");

        // find the sum of all the even number between 50 ~ 100

        for (int i = 50; i <= 100; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();


        for (int i = 50; i < 101; i += 2) {
            System.out.print(i+" ");
        }
        System.out.println();


        for (int i = 50; i < 101; i++) {
            if (i%2 !=0){ // if the i value is odd number
                continue; // skips it
            }
            System.out.print(i + " ");


        }
        System.out.println();
    }
}
