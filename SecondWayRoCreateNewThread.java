/*
    By implementing Runnable interface
    this is a functional interface provide one abstract method called run
 */
public class SecondWayRoCreateNewThread {
    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        Thread thread = new Thread(secondTask); // creating a thread by using runnable obj
        thread.start();
    }
}

class SecondTask implements Runnable
{
    String id="Thread_";
    static int instance_number =0;
    @Override
    public void run()
    {
        System.out.println("****** ["+id+"] started working ********");
        for(int i=0;i<10;i++)
        {
            System.out.println("<"+id+"> "+ i );
        }
        System.out.println("****** ["+id+"] stopped working ********");
    }

    public SecondTask() {
        instance_number++;
        id= id+ instance_number;
    }
}
