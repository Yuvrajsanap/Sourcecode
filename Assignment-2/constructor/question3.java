// Parameterized constructor

public class question3 {
    String name;
    int age;

    public question3(String name, int age) { 
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        question3 person1 = new  question3("om", 30);
        question3 person2 = new  question3("raj", 25);

        System.out.println("Person 1: " + person1.name + ", " + person1.age);
        System.out.println("Person 2: " + person2.name + ", " + person2.age);
    }
}