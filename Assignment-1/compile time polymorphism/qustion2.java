public class qustion2 {

        public double calculateArea(double side) {
            return side * side;
        }

        public double calculateArea(double length, double width) {
            return length * width;
        }
    
        public double calculateArea(double radius, boolean isCircle) {
            return Math.PI * radius * radius;
        }

        public static void main(String[] args) {
            qustion2 calculator = new qustion2();

            System.out.println("Area of the square: " + calculator.calculateArea(5));
    
            System.out.println("Area of the rectangle: " + calculator.calculateArea(4, 6));
    
            System.out.println("Area of the circle: " + calculator.calculateArea(3, true));
        }
    }
    
