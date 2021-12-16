import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadCreationWithCashedPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++)
        {
            // we are assigning task to the executor
            executorService.submit(new ThreadTask());
        }
        executorService.shutdown();
    }
}

class ThreadTask_1 implements Runnable
{
    String id="Thread_";
    static int instance_number =0;
    @Override
    public void run()
    {
        System.out.println("****** ["+id+"] started working ********");
        for(int i=0;i<10;i++)
        {
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("<"+id+"> "+ i );
        }
        System.out.println("****** ["+id+"] stopped working ********");
    }

    public ThreadTask_1() {
        instance_number++;
        id= id+ instance_number;
    }
}


/*
   1. Thread  as well as in Executor class method - setname , setpriority, getName, join , sleep, intrup the thread
   2. Synchronisation  synchronized method , block.
   Object.wait ,Object.notify , notifyAll
 */
