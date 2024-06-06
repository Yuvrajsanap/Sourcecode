class SharedResource {
    private int data;
    private boolean isProduced = false;

    public synchronized void produce(int data) throws InterruptedException {
        while (isProduced) wait();
        this.data = data; isProduced = true;
        System.out.println("Produced: " + data); notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!isProduced) wait();
        System.out.println("Consumed: " + data); isProduced = false; notify();
    }
}

public class question2{
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(() -> { for (int i = 1; i <= 5; i++) try { resource.produce(i); } catch (InterruptedException e) { e.printStackTrace(); } }, "Producer");
        Thread consumer = new Thread(() -> { for (int i = 1; i <= 5; i++) try { resource.consume(); } catch (InterruptedException e) { e.printStackTrace(); } }, "Consumer");
        producer.start(); consumer.start(); producer.join(); consumer.join();
    }
}
