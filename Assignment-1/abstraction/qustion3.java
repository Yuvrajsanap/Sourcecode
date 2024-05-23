abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}

public class qustion3 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}
