package day35_polymorphism.transportationTask;

import day34_abstraction_interface.animalTask.Flyable;
import day34_abstraction_interface.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {

    public CydeoCar(String model, String color, int year, double price) {
        super("CydeoCar", model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
