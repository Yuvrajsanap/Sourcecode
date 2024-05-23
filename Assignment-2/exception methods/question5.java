//finalize exception

public class question5 {
    private int id;

    public question5(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called for object with ID: " + id);
    }

    public static void main(String[] args) {
        new question5(1);
        System.gc();
    }
}
