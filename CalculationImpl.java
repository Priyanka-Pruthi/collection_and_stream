import java.util.Arrays;

public class CalculationImpl implements Calculator{
    @Override
    public double sum(double[] data) {
        return Arrays.stream(data).sum();
    }

    @Override
    public double multiplication(double[] data) {

        return Arrays
                .stream(data)
                .reduce(1,(ele1,ele2)->ele1*ele2);
    }
}
