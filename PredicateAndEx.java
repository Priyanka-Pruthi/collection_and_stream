import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateAndEx {
    public static void main(String[] args) {
        Predicate<Integer> minimumAgeRequired = input -> (input>=10);
        Predicate<Integer> maximumAgeRequired = input -> (input <=55);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int age = scan.nextInt();
        boolean result = maximumAgeRequired.and(minimumAgeRequired).test(age);
        //if(age>=10 && age<=55)
        if(result)
        {
            System.out.println("Eligible for policy");
        }else
        {
            System.out.println("Not Eligible for policy");
        }
    }
}
