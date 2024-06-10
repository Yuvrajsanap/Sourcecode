class question2 implements Runnable {
    public void run() {
        System.out.println("Runnable is running.");
    }
    
    public static void main(String[] args) {
        Thread thread = new Thread(new question2());
        thread.start();
    }
}
