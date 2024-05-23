// Parameterized constructor 

public class question4 {
    int width;
    int height;

    public question4(int width) { //for square
        this.width = width;
        this.height = width;
    }

    public question4(int width, int height) { //for rectangle
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        question4 square = new question4(5);  
        question4 rectangle = new question4(10, 6); 

        System.out.println("Square area: " + square.width * square.height);
        System.out.println("Rectangle area: " + rectangle.width * rectangle.height);
    }
}