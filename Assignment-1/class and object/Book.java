public class Book {

    String title;
    String author;
    double price;

   
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs " + price);
    }

    public static void main(String[] args) {
       
        Book book1 = new Book("bunch of old letter", "jawahar lal Nehru", 259);
        Book book2 = new Book("god of small things", "anirudh roy", 299);

        book1.displayInfo();
        book2.displayInfo();
    }
}
