public class Car {

    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
    
        Car car1 = new Car("Toyota", "fortuner", 2020);
        Car car2 = new Car("Honda", "Civic", 2018);

        car1.displayInfo();
        car2.displayInfo();
    }
}

