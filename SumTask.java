package returnvaluewithExecutor;

import withobserver.SumObserver;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SumTask implements Callable<Integer> {

    private int data[];
    private long sleepTime;
    private int sum = 0 ; // will hold result and need to show for result
    private String taskId ="Task";
    private static int counter = 0;

    public SumTask(long sleepTime,int ...data) {
        this.data = data;
        this.sleepTime = sleepTime;
        taskId = taskId+ ++counter;
    }
    @Override
    public Integer call() throws Exception {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("***"+currentThreadName + "with Task "+taskId+" Started *****");
        TimeUnit.MILLISECONDS.sleep(sleepTime);
        System.out.println("***"+currentThreadName + "with Task "+taskId+" Woke up *****");

        for(int ele : data)
        {
            sum+=ele;
        }

        System.out.println("***"+currentThreadName + "with Task "+taskId+" completed *****");
        return  sum;
    }
}
