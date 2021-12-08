
import model.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {


    public int compareByName(Book o1, Book o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.compareTo(o2);
    }
}
