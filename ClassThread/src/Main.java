import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread starts --");
        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.setName("Extended thread");
        extendedThread.start();
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