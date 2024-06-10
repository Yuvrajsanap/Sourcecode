class question3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        question3 thread = new question3();
        thread.start(); // This will call the run() method
    }
}
