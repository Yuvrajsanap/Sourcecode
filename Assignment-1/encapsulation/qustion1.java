class Example {
    private int number;

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
}

public class qustion1 {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.setNumber(42);
        System.out.println(obj.getNumber()); 
    }
}
