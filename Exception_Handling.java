import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        String num1 ,num2;
        Scanner scan = new Scanner(System.in);
//        try {
//            System.out.println("enter number ");
//            num1 = scan.nextInt();
//            num2 = scan.nextInt();
//            System.out.println("Division : " + (num1 / num2));
//        }catch (ArithmeticException exception)
//        {
//            System.err.println("As per maths rule we can not divide any number by zero");;
//        }catch(InputMismatchException exception)
//        {
//            System.err.println("Please provide integer value only");
//        }

//        try {
//            System.out.println("enter number ");
//            num1 = scan.next();
//            num2 = scan.next();
//            System.out.println("Division : " + (Integer.parseInt(num1) / Integer.parseInt(num2)));
//        }catch (Throwable ex)
//        {
//            if(ex instanceof ArithmeticException)
//                System.err.println("As per maths rule we can not divide any number by zero");
//            else if (ex instanceof InputMismatchException)
//                System.err.println("Please provide integer value only");
//            else
//                ex.printStackTrace();
//        }

        try {
            System.out.println("enter number ");
            num1 = scan.next();
            num2 = scan.next();
            System.out.println("Division : " + (Integer.parseInt(num1) / Integer.parseInt(num2)));
        }catch (ArithmeticException | InputMismatchException ex) // jdk 1.7 onwards catch block can have one more than one exception reference
        {
            if(ex instanceof ArithmeticException)
                System.err.println("As per maths rule we can not divide any number by zero");
            else if (ex instanceof InputMismatchException)
                System.err.println("Please provide integer value only");

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
