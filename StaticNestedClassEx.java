import java.util.Arrays;

public class StaticNestedClassEx {

    public static Utils.Result findSumAndAverage(double []data)
    {
        Utils.Result result = new Utils.Result(data.length, Arrays.stream(data).sum());
        return result;
    }

    public static void main(String[] args) {
        double array[] = new double[]{2.5,6.8,8.0,7.0};
        double average = findSumAndAverage(array).getAverage();
        System.out.println(average);
    }
}
