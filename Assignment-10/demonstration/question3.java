class SharedResource {
    private int data;
    private boolean isProduced = false;

    public synchronized void produce(int data) throws InterruptedException {
        while (isProduced) wait();
        this.data = data; isProduced = true;
        System.out.println("Produced: " + data); notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (!isProduced) wait();
        System.out.println(Thread.currentThread().getName() + " consumed: " + data); isProduced = false; notifyAll();
    }
}

public class question3 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(() -> { for (int i = 1; i <= 5; i++) try { resource.produce(i); } catch (InterruptedException e) { e.printStackTrace(); } }, "Producer");
        Thread consumer1 = new Thread(() -> { for (int i = 1; i <= 3; i++) try { resource.consume(); } catch (InterruptedException e) { e.printStackTrace(); } }, "Consumer-1");
        Thread consumer2 = new Thread(() -> { for (int i = 1; i <= 2; i++) try { resource.consume(); } catch (InterruptedException e) { e.printStackTrace(); } }, "Consumer-2");
        producer.start(); consumer1.start(); consumer2.start(); producer.join(); consumer1.join(); consumer2.join();
    }
}
