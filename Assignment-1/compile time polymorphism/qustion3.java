class qustion3 {
  
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    public void print(double num) {
        System.out.println("Printing double: " + num);
    }

    public void print(String text) {
        System.out.println("Printing string: " + text);
    }
    public static void main(String[] args) {
        qustion3 printer = new qustion3();

        printer.print(10);

        printer.print(5.5);

        printer.print("Hello, World!");
    }
}
