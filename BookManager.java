
import model.Book;

import java.util.*;

//import assignments.Book;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookManager {
    List<Book> bookList = null;

    public void addBooks() {
        Book b = new Book("Circe", 500, "author1", "Fantasy");
        Book b1 = new Book("Ninth House", 600, "author1", "Fantasy");
        Book b2 = new Book("The Help", 700, "author1", "Fiction");
        Book b3 = new Book("One Hundred Years of Solitude", 400, "author1", "Fiction");
        Book b4 = new Book("The Ninth Fire", 300, "author1", "Mystery");
        Book b5 = new Book("The Advantures of Sherloch Holmes", 800, "author1", "Mystery");
        bookList = Arrays.asList(b, b1, b2, b3, b4, b5);
    }

    public List<Book> getBookByCategory(String categoryName) {
        Predicate<Book> bookList1 = input -> input.getCategory().equalsIgnoreCase(categoryName);
        return bookList.stream().filter(bookList1).collect(Collectors.toList());
    }

    public List<Book> applyDiscountByCategoryAndPercentage(String categoryName , float discountPercentage)
    {
        Predicate<Book> bookList1 = input -> input.getCategory().equalsIgnoreCase(categoryName);
        return bookList.stream()
                .filter(bookList1)
                .map(book -> book.withDiscountedPrice(discountPercentage))
                .collect(Collectors.toList());
    }


    public List<String> getBookNames()
    {
          return bookList.stream()
                  .map(Book::getBookName)
                  .collect(Collectors.toList());
    }

    public List<Book> getCheapestBookInStore(int limit)
    {
        return bookList.stream()
                .sorted()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public Optional<Float> getMaxPrice()
    {
       // BookComparator bookComparator = new BookComparator();
       return bookList.stream().max((o1,o2)->{return o1.compareTo(o2);}).map(Book::getBookPrice);

    }

    public void expensiveBookByCategory()
    {
        //1. fetch all the available category in list
        Set<String> categories = bookList.stream()
                                .map(Book::getCategory)
                                .collect(Collectors.toSet());
        System.out.println(categories);
        // iterating the categories and finding the max price
        categories.forEach(category->{
           Optional<Float> expensiveBookPrice =  bookList.stream()
                   .filter(book -> book.getCategory().equals(category))
                    .max((o1, o2) -> {return o1.compareTo(o2);})
                    .map(Book::getBookPrice);

            System.out.println(category +"    "+(expensiveBookPrice.isPresent()?expensiveBookPrice.get():0));

        });

    }
}

/*  Set
    1. is an interface , used to store element uniquely.
    2. add the data in collection , it internally call compare method
    3. HashSet , TreeSet



 */