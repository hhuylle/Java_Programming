package day30_inheritance.practiceTasks.planetTask;

public class Planet {
    /*
    planetTask:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()
    */
    private String name;
    private  double mass, radius, surfaceGravity, surfaceArea;
    private  long volume, population;
    private static double pi;

    static{
        pi = 3.14;
    }

    public Planet(String name, double mass, double radius, double surfaceGravity, double surfaceArea, long volume, long population) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
        setVolume((long) ((4/3*pi)*radius*radius*radius));
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }

    /*
	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
     */
}
