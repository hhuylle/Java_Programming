package WednesdayLiveSession.Week11;

public class Workout {
    /*
    Workout [Encapsulation, access modifiers, classes, objects, methods]

    Create a class Workout
    define and encapsulate these instance variables:
        name, duration, calories burned

    create a constructor to initialize the variables. Call the setters in the constructor

    in the setters only set the values if they are valid data based on these requirements:
        name: should have only letters and spaces, no other characters type. The name cannot be empty either

        duration: should be more than 0

        calories burned: should be more than 0 and less than 1000

    create another class to test the Workout objects
     */
    private String name;
    private int duration; // represents in minutes
    private int caloriesBurned;

    public Workout(String name, int duration, int caloriesBurned) {
        setName(name);
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Name can not be empty");
            System.exit(1);
        }

        boolean isValidName = true;
        for (char each : name.toCharArray()) {
            if (!Character.isLetter(each) && each != ' '){
                isValidName = false;
                break;
            }
        }
        if (isValidName){
            this.name = name;
        }else {
            System.err.println("Name should have only letters and spaces, no other characters type");
            System.exit(1);
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration>0){
            this.duration = duration;
        }else {
            System.err.println("Duration should be more than 0");
            System.exit(1);
        }

    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        if (caloriesBurned>0 && caloriesBurned<1000){
            this.caloriesBurned = caloriesBurned;
        }else {
            System.err.println("Calories burned should be more than 0 and less than 1000");
            System.exit(1);
        }
    }

    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}
