
public class Person {
    
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("yuvraj", 20);
        Person person2 = new Person("raj", 25);

        person1.displayInfo();
        person2.displayInfo();
    }
}
