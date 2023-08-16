package WednesdayLiveSession.Week11;

public class TestCountry {

    public static void main(String[] args) {

        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.co2Level);

        System.out.println("----------------------------");

        Country.countryInfo();

        System.out.println("----------------------------");

        Country us = new Country("USA",350,"North American");
        System.out.println(us);

    }
}
