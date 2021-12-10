import java.util.Arrays;

public class AnonymousClassEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
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
        };

        System.out.println(calculator.sum(new double[]{1.0,2.0,3.0}));
        System.out.println(calculator.multiplication(new double[]{1.0,2.0,3.0}));
    }
}
