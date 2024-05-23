class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class qustion2 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); 
    }
}
