package withobserver;

public class THreadExample {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() +" has started ");
        SumObserver observer = new SumObserver();
        SumTask task1 = new SumTask(observer,100,1,2,3,4,5,6,7);
        Thread t1 = new Thread(task1, "TASK_1");
        SumTask task2 = new SumTask(observer,2000,3,1000);
        Thread t2 = new Thread(task2, "TASK_2");
        SumTask task3 = new SumTask(observer,1000,3,500,5,8,9);
        Thread t3 = new Thread(task3, "TASK_3");

        t1.start();
        t2.start();
        t3.start();
    }
}
