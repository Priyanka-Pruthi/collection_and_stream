import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadNameWithExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2,new NamedThreadFactory());
        for(int i=0;i<6;i++)
        {
            // we are assigning task to the executor
            executorService.submit(new ThreadNameTask_2());
        }
        // it will stop accepting the new task but already assigned task in queue will be run and complete.
        executorService.shutdown();
    }
}


class ThreadNameTask_2 implements Runnable {

    String id = "Thread_";
    static int instance_number = 0;

    @Override
    public void run() {
        // by default namee for thread in pool is like pool-poolno-thread-threadno
        System.out.println("****** [" + Thread.currentThread().getName() + "] started working ********");
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("<" + Thread.currentThread().getName() + "> " + i);
        }
        System.out.println("****** [" + Thread.currentThread().getName() + "] stopped working ********");
    }

    public ThreadNameTask_2() {
        instance_number++;
        id = id + instance_number;
    }
}
