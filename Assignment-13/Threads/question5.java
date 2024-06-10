class question5 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
    
    public static void main(String[] args) {
        question5 thread1 = new question5();
        question5 thread2 = new question5();
        
        thread1.start(); // This will call the run() method
        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        thread2.start(); // 
    }
}
