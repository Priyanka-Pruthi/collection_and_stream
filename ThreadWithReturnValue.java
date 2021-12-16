import java.util.concurrent.TimeUnit;

public class ThreadWithReturnValue {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() +" has started ");
        SumTask task1 = new SumTask(100,1,2,3,4,5,6,7);
        Thread t1 = new Thread(task1, "TASK_1");
        SumTask task2 = new SumTask(2000,3,1000);
        Thread t2 = new Thread(task2, "TASK_2");
        SumTask task3 = new SumTask(1000,3,500,5,8,9);
        Thread t3 = new Thread(task3, "TASK_3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Task 1 - Sum value :"+task1.getSumValue());
        System.out.println("Task 2 - Sum value :"+task2.getSumValue());
        System.out.println("Task 3 - Sum value :"+task3.getSumValue());
    }
}

class SumTask implements Runnable
{
     private int data[];
     private long sleepTime;
     private int sum = 0 ; // will hold result and need to show for result
    private boolean done = false; // will host task status completed by thread or not
    private String taskId ="Task";
    private static int counter = 0;

    public SumTask(long sleepTime,int ...data) {
        this.data = data;
        this.sleepTime = sleepTime;
        taskId = taskId+ ++counter;
    }


    @Override
    public void run() {
        System.out.println("*****"+Thread.currentThread().getName()+" started working ****");
        try
        {
            System.out.println("*****"+Thread.currentThread().getName()+" going to sleep for "+sleepTime+" ms ****");
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        }catch(Exception ex)
        {
         ex.printStackTrace();
        }
        System.out.println("*****"+Thread.currentThread().getName()+" woke up from sleep for ****");
        for(int ele : data)
        {
            sum+=ele;
        }

        System.out.println("*****"+Thread.currentThread().getName()+" completed  ****");

        done = true;

        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName()+"is notifying ");
            this.notify();
        }
    }

    public int getSumValue()
    {
        synchronized (this)
        {
            if(!done)
            {
                try
                {
                    System.out.println(Thread.currentThread().getName()+" is waiting for result " + taskId + " to be completed");
                    this.wait();
                }catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        return sum;
    }

}
