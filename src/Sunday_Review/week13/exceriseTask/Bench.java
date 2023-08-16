package Sunday_Review.week13.exceriseTask;

public class Bench extends Lifting{

    @Override
    public void rackWeight() {
        System.out.println("Racking on top");
    }

    @Override
    public void perform() {
        System.out.println("Bench pressing");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes*5;
    }
}
/*
create a class Bench
	inherit the Lifting class and implement the abstract methods
		for calories method return minutes * 5
 */
