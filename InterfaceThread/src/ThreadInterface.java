import java.util.concurrent.TimeUnit;

public class ThreadInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Extended Thread starts -- ");
        for(int i=0;i<5;i++){
            System.out.println("["+i+"]+ Inside"+Thread.currentThread().getName());
            sleepOneSecond();
        }
    }
    private void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
