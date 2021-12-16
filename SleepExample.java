import java.time.Instant;
import java.util.Arrays;

public class SleepExample extends Thread{
    String []data = new String[]{"Data1","Data2","Data3","Data4"};
     public SleepExample()
     {

     }

     public void run()
     {
         Arrays.stream(data).forEach(element->{
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 System.out.println("Example Thread is interrupted ");
                 e.printStackTrace();
             }
             System.out.println(element);
         });
     }

    public static void main(String[] args) {
        Instant instant =Instant.now();
        System.out.println("In main");
        SleepExample example = new SleepExample();
        System.out.println(example.getState());
        example.start();
        System.out.println(example.getState());

        try {

            System.out.println("is example thread active "+example.isAlive());
            do
            {
                Instant instant1 = Instant.now();
                if((instant1.getEpochSecond() - instant.getEpochSecond())<5)
                {
                    System.out.println("still waiting for example thread");
                     example.join(1000);
                }else
                {
                    System.out.println("Going to interrupt example thread");
                    example.interrupt();
                }
            }while(!example.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished Main");

    }
}
