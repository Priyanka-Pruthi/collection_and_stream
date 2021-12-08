import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            Predicate is functional interface ,
         */
        Predicate<Integer> eligibleForVote = input -> (input>=18);

        System.out.println("enter Age");
        int age = scanner.nextInt();

        System.out.println("Is user eligible for voting : "+eligibleForVote.test(age));
    }
}
