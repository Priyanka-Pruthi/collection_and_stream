package returnvaluewithExecutor;

import java.util.concurrent.*;

public class ThreadWithCompletionService {
    public static void main(String[] args) {
        System.out.println("*****" + Thread.currentThread().getName() + " started *********");
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService);
        completionService.submit(new SumTask(500, 1, 2, 3, 4));
        completionService.submit(new SumTask(2000, 1, 2, 3, 4, 5));
        completionService.submit(new SumTask(1000, 1, 2, 3, 4, 9));

        try {
            for(int i=0;i<3;i++) {
                Future<Integer> result1 = completionService.take();
                System.out.println(result1.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();


        }
    }
}
