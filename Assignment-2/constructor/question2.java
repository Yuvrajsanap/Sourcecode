//default constructor

public class question2 {
    String model;

    public question2() { 
        model = "Default Constructor";
    }

    public static void main(String[] args) {
        question2 car1 = new question2();
        System.out.println("car1.model: " + car1.model); 
    }
}