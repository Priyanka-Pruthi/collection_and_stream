package withobserver;

// will act as observer or listener to listen the event
public interface ResultListener<T> {
    public void notifyResult(T result);
}
