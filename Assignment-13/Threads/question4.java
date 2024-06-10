class question4 extends Thread {
    private String threadName;
    
    question4(String name) {
        threadName = name;
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(threadName + " - " + i);
        }
    }
    
    public static void main(String[] args) {
        question4 thread1 = new question4("Thread1");
        question4 thread2 = new question4("Thread2");
        
        thread1.start(); 
        thread2.start(); 
    }
}
