    class qustion1{
   
        public int add(int a, int b) {
            return a + b;
        }
    
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        public double add(double a, double b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            qustion1 obj = new qustion1();
    
            System.out.println("Sum of two integers: " + obj.add(10, 20));
    
            System.out.println("Sum of three integers: " + obj.add(10, 20, 30));
    
            System.out.println("Sum of two doubles: " + obj.add(10.5, 20.5));
        }
    }
    