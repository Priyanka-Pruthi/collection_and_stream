import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<Integer,Integer> sqrtFunction = input -> input*input;

        Integer result = sqrtFunction.apply(6);
        System.out.println(result);

        BiFunction<Float,Float,Float> additionFunction = (num1,num2)-> num1+num2;

        Float sum = additionFunction.apply(12.0f,13.0f);
        System.out.println(sum);
    }
}
