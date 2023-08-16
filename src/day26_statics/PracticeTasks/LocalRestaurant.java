package day26_statics.PracticeTasks;

import java.time.LocalDate;

public class LocalRestaurant {
    /*
    Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object
	            - Print your whole restaurants information
     */
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Johny","Texas",3);

        Server[] servers = {
                new Server("Anna", 11, 32, false,LocalDate.of(2022,10,15)),
                new Server("Bella", 12, 37, true,LocalDate.of(2022,11,27)),
                new Server("Tom", 13, 30, false,LocalDate.of(2022,9,5)),
                new Server("kevin", 14, 28, false,LocalDate.of(2022,12,14)),
                new Server("Ryan", 15, 40, true,LocalDate.of(2022,11,30)),
        };

        Chef[] chefs = {
                new Chef("Gordon", 21, 35, true),
                new Chef("James", 22, 30, false),
                new Chef("Michael", 23, 38, true),
        };

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);



    }

}
