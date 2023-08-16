package day31_inheritance.practiceTasks.statesTask;

public class StatesObjects {
    /*
     Create a class named StateObjects
                    Create the objects of each sub classes

                    test all the functions of each objects

                    Analyze the relationships between the classes
     */

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Republican",8683619,5.75);

        Texas texas = new Texas(29145505,8.2);

        Florida florida = new Florida(22244823,7.02);

        California california = new California(39185605,8.82);

        System.out.println(virginia);
        System.out.println(florida);
        System.out.println(texas);


    }
}

