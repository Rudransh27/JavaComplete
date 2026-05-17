// Abstraction is focusing on what it does instead of how it does it.
// we cannot create an object of abstract class.

public class Lec6_AbastractionAndPolymorphism {

    public static void main(String[] args) {

        Car ec = new ElectricCar();
        Car fc = new FuelCar();

        ec.start();
        ec.accelerate();
        ec.stop();
        
        System.out.println("........................");

        fc.start();
        fc.accelerate();
        fc.stop();
    }
}

abstract class Car {
    void start() {
        System.out.println("Car is starting");
    }

    abstract void accelerate();

    abstract void stop();
}

class ElectricCar extends Car {
    void accelerate() {
        System.out.println("Electric Car is accelerating");
    }

    void stop() {
        System.out.println("Electric Car is stopping");
    }
}

class FuelCar extends Car {
    void accelerate() {
        System.out.println("Fuel Car is accelerating");
    }

    void stop() {
        System.out.println("Fuel Car is stopping");
    }
}






