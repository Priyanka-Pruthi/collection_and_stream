import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {
    private static int count =0;
    private static  String NAME = "POOLWORKER-";

    @Override
    public Thread newThread(Runnable r) {
        Thread t =new Thread(r,NAME+ ++count);
        return t;
    }
}

// How we can set priority to the threads in pool using executor interface