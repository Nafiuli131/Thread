public class Main {
    public static void main(String[] args) {
        ThreadInterface threadInterface = new ThreadInterface();
        Thread thread = new Thread(threadInterface);
        thread.setName("Runnable Thread ");
        thread.start();
    }
}