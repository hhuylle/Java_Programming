package Sunday_Review.week13.exceriseTask;

public final class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Running on the weekend");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes*15;
    }
}
/*
create a class Running
	inherit the Exercise class and implement the abstract methods
		for calories method return minutes * 15
 */
