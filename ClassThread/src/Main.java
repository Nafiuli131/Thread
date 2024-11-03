import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts --");
        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.setName("Extended thread");
        extendedThread.start();
//        extendedThread.join();
//        it means like first complete all extendedThread works,then go to the main thread
        for(int i=0;i<5;i++){
            System.out.println("Inside"+Thread.currentThread().getName());
            sleepOneSecond();
        }
    }
    private static void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}