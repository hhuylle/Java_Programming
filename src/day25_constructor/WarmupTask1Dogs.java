package day25_constructor;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTask1Dogs {
    /*
    Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

            1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops
     */
    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        //1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs2 array to smallDogs arrayList

        //            Note: DO NOT use any loops


        ArrayList<Dog> smallDogs = new ArrayList<>();

        smallDogs.addAll(Arrays.asList(dogs));

        smallDogs.removeIf(d-> !(d.size.equalsIgnoreCase("small")));
        System.out.println(smallDogs);
        System.out.println("----------------------------------------------");
        //1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs2 array to youngDogs arrayList

        //	            Note: DO NOT use any loops

        ArrayList<Dog> youngDogs = new ArrayList<>();

        youngDogs.addAll(Arrays.asList(dogs));

        youngDogs.removeIf(y-> y.age>4);
        System.out.println(youngDogs);
        System.out.println("-------------------------------------");
        //1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs2 array to femaleDogs arrayList

        //	            Note: DO NOT use any loops

        ArrayList<Dog> femaleDogs = new ArrayList<>();

        femaleDogs.addAll(Arrays.asList(dogs));

        femaleDogs.removeIf(f-> f.gender == 'M');
        System.out.println(femaleDogs);
        System.out.println("-----------------------------------");
        //1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs2 array to maleDogs arrayList
        //
        //	            Note: DO NOT use any loops

        ArrayList<Dog> maleDogs = new ArrayList<>();

        maleDogs.addAll(Arrays.asList(dogs));

        maleDogs.removeIf(m-> m.gender == 'F');

        System.out.println(maleDogs);

        System.out.println("========================================================================================");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));//convert from Array to arrayList

        list.removeIf(s-> s.size.equalsIgnoreCase("small"));

        dogs2 = list.toArray(new Dog[0]);//convert from ArrayList to Array

        System.out.println(Arrays.toString(dogs2));

    }

}
