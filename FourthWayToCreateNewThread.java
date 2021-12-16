/*
    by using lambda expression to provide implementation for run method in Runnable interface
 */
public class FourthWayToCreateNewThread {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{

                System.out.println("****** [Task] started working ********");
                for(int i=0;i<10;i++)
                {
                    System.out.println( i );
                }
                System.out.println("****** [Task] stopped working ********");
            });
        thread.start();
    }
}
