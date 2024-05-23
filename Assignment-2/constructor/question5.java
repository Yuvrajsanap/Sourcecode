// Parameterized constructor

public class question5 {
    String title;
    int pageCount;

    public question5(String title, int pageCount) { 
        this.title = title;
        this.pageCount = pageCount;
    }

    public static void main(String[] args) {
        question5 book1 = new question5("Pride and Prejudice", 200);
        question5 book2 = new question5("The Lord of the Rings", 1178);

        System.out.println("Book 1: " + book1.title + ", " + book1.pageCount + " pages");
        System.out.println("Book 2: " + book2.title + ", " + book2.pageCount + " pages");
    }
}