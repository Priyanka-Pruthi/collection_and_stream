/*
     Executor Framework
         release in jdk5
         is used Runnable objects without creating a new Thread everytime
         it can reuse the already created thread objects to complete the submitted task
         java.util.concurrent.Executors provide us factory method that are using to create a thread pool.
         Threadpool  is basically overcoming the issue by keeping the threads alive and reuse them
         internally Executor framework maintains queue to save the task
         the excess tasks stores inside queue , whenever the thread gets free , it will pick the next task from queue

         Executors available in Java
         FixedThreadPool
         CachedThreadPool
         SingleThreadExecutor
         SecheduledExecutor


         ExecutorService
         Executors


 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadCreationWithExecutors {
    public static void main(String[] args) {
        // we have instantiated fixed thread pool object with 3 threads
        // at a time maximum 3 threads can only run or execute the task
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0;i<6;i++)
        {
            // we are assigning task to the executor
            executorService.submit(new ThreadTask());
        }
        // it will stop accepting the new task but already assigned task in queue will be run and complete.
        executorService.shutdown();
        executorService.shutdownNow();
        executorService.submit(new ThreadTask());
    }
}


class ThreadTask implements Runnable
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

    public ThreadTask() {
        instance_number++;
        id= id+ instance_number;
    }
}


