package Sunday_Review.week10;

import java.util.Arrays;

public class UseEarth {

    public static void main(String[] args) {

        //Earth.northAmerica: this is how to access the Arraylist

        Earth.northAmerica.add(new Person("James",30));
        Earth.northAmerica.addAll(Arrays.asList(
                new Person("Anna",20),
                new Person("Jane",24)
        ));


    }

}
