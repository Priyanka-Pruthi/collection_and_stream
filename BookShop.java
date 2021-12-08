import model.Book;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.addBooks();
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Category");
//        String categoryName = scan.next();
//        List<Book> result = bookManager.getBookByCategory(categoryName);
//        result.stream().forEach(System.out::println);
//
//        List<Book> bookListWithDiscountedPrice = bookManager.applyDiscountByCategoryAndPercentage(categoryName,0.1f);
//        bookListWithDiscountedPrice.stream().forEach(System.out::println);
//
//        List<String> availableBookNames = bookManager.getBookNames();
//        availableBookNames.stream().forEach(System.out::println);

//        System.out.println("How Many book you want to see");
//        int limit = scan.nextInt();
//        List<Book> result = bookManager.getCheapestBookInStore(limit);
//        result.stream().forEach(System.out::println);
//
//        Optional<Float> maxPrice = bookManager.getMaxPrice();
//        System.out.println("Max price :"+(maxPrice.isPresent()?maxPrice.get():0));

          bookManager.expensiveBookByCategory();

    }
}
