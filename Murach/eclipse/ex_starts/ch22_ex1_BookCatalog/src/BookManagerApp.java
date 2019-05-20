import java.util.List;

public class BookManagerApp {

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        
        List<Book> booksByTitle = manager.getBooks ( 
        b -> b.getTitle().equals("Java Programming"));
        System.out.println("\nBooks by Title: ");
        printList(booksByTitle);
//        List<Book> booksByTitle = manager.getBooksByTitle("Java Programming");
//        System.out.println("\nBOOKS BY TITLE:");
//        printList(booksByTitle);
        
        List<Book> booksByCategory = manager.getBooks(
        b -> b.getCategory().equals("Java"));
        System.out.println("\nBOOKS BY CATEGORY:");
        printList(booksByCategory);
        
        List<Book> booksByFormat = manager.getBooks(
        b ->b.getFormat().equals("Paperback"));
        System.out.println("\nBOOKS BY FORMAT:");
        printList(booksByFormat);
        
    }
    
    public static void printList(List<Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}