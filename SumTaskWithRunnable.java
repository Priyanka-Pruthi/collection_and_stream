package returnvaluewithExecutor;



import java.util.concurrent.TimeUnit;

class SumTaskWithRunnable implements Runnable {
    private int data[];
    private long sleepTime;
    private int sum = 0; // will hold result and need to show for result

    private String taskId = "Task";
    private static int counter = 0;

    public SumTaskWithRunnable(long sleepTime, int... data) {
        this.data = data;
        this.sleepTime = sleepTime;
        taskId = taskId + ++counter;
    }


    @Override
    public void run() {
        System.out.println("*****" + Thread.currentThread().getName() + " started working ****");
        try {
            System.out.println("*****" + Thread.currentThread().getName() + " going to sleep for " + sleepTime + " ms ****");
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("*****" + Thread.currentThread().getName() + " woke up from sleep for ****");
        for (int ele : data) {
            sum += ele;
        }

        System.out.println("*****" + Thread.currentThread().getName() + " completed  and going to notify observer ****");


    }
}
