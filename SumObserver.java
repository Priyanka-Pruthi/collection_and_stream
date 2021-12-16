package withobserver;

public class SumObserver implements ResultListener<Integer>{
    @Override
    public void notifyResult(Integer result) {

        System.out.println("Result :"+result);
    }
}
