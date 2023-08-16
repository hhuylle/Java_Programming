package WednesdayLiveSession.Week11;

public class Country {
    /*
    Country [static, instance, class, object]
    Create a class Country
    define these static variables:
        planet - Earth
        world population - 7.88 billion - represent as a double 7.88 -
        world co2 level - 417.83 - represent as a double - the unit is ppm (parts per million)
    define these instance variables:
         name, population, continent
    create a static block to initialize the static variables
    create a constructor to initialize the instance variables
    create a different class to test the Country objects and static variables
     */

    public static String planet;
    public static double worldPopulation;// represents in billions
    public static double co2Level; // represents in parts per million

    public String name;
    public double population; // represents in millions
    public String continent;

    static {
        planet = "Earth";
        worldPopulation = 7.88;
        co2Level = 417.83;
    }

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public static void countryInfo(){
        System.out.println(planet);
        System.out.println(worldPopulation+" billions");
        System.out.println(co2Level+" ppm");
    }

    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                "million, continent='" + continent + '\'' +
                '}';
    }
}
