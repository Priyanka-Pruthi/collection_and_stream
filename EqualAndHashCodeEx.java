import model.Book;

public class EqualAndHashCodeEx {
    public static void main(String[] args) {
        Book b1 = new Book("b1  b2",200.0f,"Robin Sharma","fiction") ;
        Book b2 = new Book("b1 b2 ",200.0f,"Robin Sharma","fiction") ;

        System.out.println("is b1 equals to b2 : "+(b1.equals(b2)));
        System.out.println("Hash Code : \n b1 :  "+b1.hashCode()+"\n b2: "+b2.hashCode());
    }
}
