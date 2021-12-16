import java.util.concurrent.TimeUnit;

/*
  when we are setting any thread name , on our behalf thread name is set as Thread and
   integer counter
   ex thread_0
      thread_1

       only the main method thread  is named as main
 */
public class ThreadNameEx_1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadNameTask_1(),"First_Task");
        Thread thread2 = new Thread(new ThreadNameTask_1());

        thread1.start();
        thread2.start();
         try
         {
             TimeUnit.SECONDS.sleep(4);
         }catch (InterruptedException ex)
         {
             ex.printStackTrace();
         }
        thread2.setName("Second_Task");
    }

}


class ThreadNameTask_1 implements Runnable
{

    String id="Thread_";
    static int instance_number =0;
    @Override
    public void run()
    {

        System.out.println("****** ["+Thread.currentThread().getName()+"] started working ********");
        for(int i=0;i<10;i++)
        {
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("<"+Thread.currentThread().getName()+"> "+ i );
        }
        System.out.println("****** ["+Thread.currentThread().getName()+"] stopped working ********");
    }

    public ThreadNameTask_1() {
        instance_number++;
        id= id+ instance_number;
    }
}

