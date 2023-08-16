package Sunday_Review.week13.exceriseTask;

public class Gym {

    public static void main(String[] args) {

        //Exercise obj = new Exercise(); Abstract class cannot instantiate

        Running running = new Running();
        running.perform();
        System.out.println(running.getCaloriesBurned(60));
        System.out.println();

        //Lifting obj = new Lifting(); cannot instantiate

        Bench bench = new Bench();
        bench.perform();
        bench.rackWeight();
        System.out.println(bench.getCaloriesBurned(15));

    }
}
/*
	create a class Gym to test the objects and methods
 */
