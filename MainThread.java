package returnvaluewithExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
As we know when we create our thread using runnable interface ,return type of run methos is void , so we can not return any value.
to resolve this issue in Executor framework , there is another interface provide name Callable
  Callable interface provide us method call
     public T call() throws Exception

  executorService.submit(Callable c) return  a Future Object

  to get the value we can call Future.get()


 */
public class MainThread {
    public static void main(String[] args) {
        System.out.println("***"+Thread.currentThread().getName()+" Started *****");
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> result1=executorService.submit(new SumTask(1000, 1,2,3,4,5));
        Future<Integer> result2=executorService.submit(new SumTask(2000, 1,2,3,4,5));
        Future<Integer> result3=executorService.submit(new SumTask(1000, 1,2,3,4,5));

        Future<?> result4 = executorService.submit(new SumTaskWithRunnable(1000,1,2,3));
        Future<String> result5 = executorService.submit(new SumTaskWithRunnable(1000,1,2,3),"Data processed");

        executorService.shutdown();

        try {
            System.out.println("Result 1 : "+result1.get());
            System.out.println("Result 2 : "+result2.get());
            System.out.println("Result 3: "+result3.get());
            System.out.println("Result 4: "+result4.get());
            System.out.println("Result 5: "+result5.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

