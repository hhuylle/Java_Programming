package WednesdayLiveSession.Week11;

public class TestWorkout {

    public static void main(String[] args) {

        Workout bench = new Workout("Bench Press",60,250);

        Workout running = new Workout("Running",120,500);

        Workout pushup = new Workout("Pushing Up",5,100);

        System.out.println(bench);
        System.out.println(running);
        System.out.println("Doing "+ pushup.getName()+ " for "+ pushup.getDuration()+ " minutes and burning "+pushup.getCaloriesBurned()+" calories");
    }
}
