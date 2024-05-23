abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("sorcecode software");
    }
}

public class qustion1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
