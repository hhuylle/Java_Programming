package day34_abstraction_interface.animalTask;

public interface Playable {

     boolean isFriendly = true; // static & final are given by default

     /*
     public static void main(String[] args) {

          System.out.println(isFriendly);

          //isFriendly = false;
     }


     default void play(){

     }
 */

     void play(); // this is abstract method


}
