public class question2 {
  private static final Object lock1 = new Object();
  private static final Object lock2 = new Object();
  private static int evenNumber = 0;

  public static void main(String[] args) {
      Thread evenThread = new Thread(() -> {
          synchronized (lock1) {
              System.out.println("EvenThread: lock 1...");
              try { Thread.sleep(50); } catch (InterruptedException e) {}
              synchronized (lock2) {
                  evenNumber += 2;
                  System.out.println("EvenThread: Incremented even number to " + evenNumber);
              }
          }
      });

      Thread oddThread = new Thread(() -> {
          synchronized (lock1) {  // Changed to lock1 first
              System.out.println("OddThread:lock 1...");
              try { Thread.sleep(50); } catch (InterruptedException e) {}
              synchronized (lock2) {
                  evenNumber--;
                  System.out.println("OddThread: Decremented even number to " + evenNumber);
              }
          }
      });

      evenThread.start();
      oddThread.start();
  }
}
