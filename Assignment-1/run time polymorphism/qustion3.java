class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car moves on roads");
    }
}

public class qustion3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.move(); 
    }
}
