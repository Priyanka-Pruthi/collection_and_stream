import java.util.Scanner;

public class StackEx {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
//        System.out.println("How many elements you want to add in stack");
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        for(int i=0;i<size;i++)
//        {
//            System.out.print("enter data : ");
//            stack.push(scan.nextInt());
//            System.out.println("");
//        }
//
//        System.out.println("1. add new Data\n" +
//                "2. Peek data \n" +
//                "3 Pop DATA \n" +
//                "4 Print Stack \n " +
//                "Press -1 to exit");
//        int choice=0;
//        do {
//            System.out.println("enter choice");
//            choice = scan.nextInt();
//            switch (choice)
//            {
//                case 1:
//                    System.out.print("enter data : ");
//                    stack.push(scan.nextInt());
//                    break;
//                case 2:
//                    Integer data = stack.peek();
//                    if(data!= null)
//                        System.out.println(data);
//                    break;
//
//                case 3:
//                    Integer data1 = stack.pop();
//                    if(data1!= null)
//                        System.out.println(data1);
//                    break;
//                case 4:
//                    stack.printStack();
//                    break;
//                case -1:
//                    System.out.println("Bye Bye");
//                    break;
//                default:
//                    System.out.println("Please enter valid option");
//                    break;
//            }
//        }while(choice != -1);
        System.out.println(stack.getClass());
      }
}
