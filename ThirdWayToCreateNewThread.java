
/*
     By Using the anonymous class
 */
public class ThirdWayToCreateNewThread {

    public static void main(String[] args) {
       Thread thread= new Thread(new Runnable(){
            public void run()
            {
                System.out.println("****** [Task] started working ********");
                for(int i=0;i<10;i++)
                {
                    System.out.println( i );
                }
                System.out.println("****** [Task] stopped working ********");
            }
        });
       thread.start();
    }
}
