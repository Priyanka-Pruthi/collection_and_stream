package model;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private String bookName;
    private float bookPrice;
    private String authorName;
    private String category;

    public Book()
    {

    }

    public Book(String bookName, float bookPrice, String authorName, String category) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.category = category;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", authorName='" + authorName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public Book withDiscountedPrice(float discountPercentage)
    {
          this.setBookPrice(this.getBookPrice() - (this.getBookPrice()*discountPercentage));
          return this;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookPrice > o.bookPrice
                ? 1
                : this.bookPrice < o.bookPrice
                ? -1
                : 0;
    }
/*
    Book b1 = new Book("Becoming",300.0f,"Mrs Obama","Biography");
    Book b2 = new Book("Becoming",350.0f,"Mrs Obama","Biography");
    Book b3 = b1
    b1.equals(b3)
    Employee e1 = new Employee();
    b1.equals(e1)

    b2.equals(b1)

    == and equals
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Float.compare(book.bookPrice, bookPrice) == 0
                && bookName.equals(book.bookName)
                && authorName.equals(book.authorName) &&
                category.equals(book.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookPrice, authorName, category);
    }
}
