class question3 implements Runnable {
    private String[] data;

    question3(String[] data) {
        this.data = data;
    }
    public void run() {
        for (String datum : data) {
            System.out.println("Processing: " + datum);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Data processing completed.");
    }
    public static void main(String[] args) {
        String[] data = { "data1", "data2", "data3", "data4" };
        question3 dataProcessingRunnable = new question3(data);
        Thread thread = new Thread(dataProcessingRunnable);
        thread.start();
    }
}
