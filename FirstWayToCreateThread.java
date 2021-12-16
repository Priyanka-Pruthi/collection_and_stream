/*
      By Extending Thread Class
 */
public class FirstWayToCreateThread {
    public static void main(String[] args) {
        // instantiating Thread Object
        FirstThread thread_0 = new FirstThread();
        System.out.println("thread_0 State : "+thread_0.getState());
        thread_0.start();
        FirstThread thread_1 = new FirstThread();
        System.out.println("thread_1 State : "+thread_1.getState());
        thread_1.start();
        FirstThread thread_2 = new FirstThread();
        System.out.println("thread_2 State : "+thread_2.getState()); // Thread State is NEW
        // to move from NEW TO RUNNABLE STATE
        thread_2.start();
    }
}

class FirstThread extends Thread
{
    String id="Thread_";
    static int instance_number =0;
    //run method help us to define task to be done by thread
    public void run()
    {
        System.out.println("****** ["+id+"] started working ********");
        for(int i=0;i<10;i++)
        {
            System.out.println("<"+id+"> "+ i );
        }
        System.out.println("****** ["+id+"] stopped working ********");
    }

    public FirstThread()
    {
        instance_number++;
        id= id+ instance_number;
    }
}
