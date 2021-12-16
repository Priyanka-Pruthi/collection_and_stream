import java.util.concurrent.TimeUnit;

public class SetPriorityExcemple {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i=0;i<3;i++) {
                try
                {
                    TimeUnit.SECONDS.sleep(1);
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
                System.out.println("First Thread");
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<3;i++) {
                try
                {
                    TimeUnit.SECONDS.sleep(1);
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
                System.out.println("Second Thread");
            }
        });

        t1.setPriority(1);
        t2.setPriority(9);
        t1.start();
        t2.start();

    }
}
