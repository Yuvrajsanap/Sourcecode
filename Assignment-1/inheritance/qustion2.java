class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car is moving");
    }
}

class SportsCar extends Car {
    void race() {
        System.out.println("Sports car is racing");
    }
}

public class qustion2 {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();
        myCar.move();   
        myCar.speed(); 
        myCar.race();   
    }
}
